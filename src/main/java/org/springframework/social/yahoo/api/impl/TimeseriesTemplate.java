package org.springframework.social.yahoo.api.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.social.yahoo.api.Timeseries;
import org.springframework.social.yahoo.api.Timeseries.Query;
import org.springframework.social.yahoo.api.Timeseries.Quote;
import org.springframework.social.yahoo.api.TimeseriesOperations;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestOperations;

import com.fasterxml.jackson.databind.ObjectMapper;

class TimeseriesTemplate extends AbstractTemplate implements TimeseriesOperations
{
	private static final String sql = "select * from yahoo.finance.historicaldata where symbol = \"%s\" and startDate = \"%s\" and endDate = \"%s\"";
	private static final String environment = "store://datatables.org/alltableswithkeys";
	private static final String format = "json";

	private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	public TimeseriesTemplate(RestOperations restOperations, ObjectMapper objectMapper,
			boolean isAuthorized)
	{
		super(restOperations, objectMapper, isAuthorized);
	}

	public List<Quote> getTimeseries(String symbol, Calendar from, Calendar to)
	{
		if (daysBetween(from, to) > 366)
		{
			List<Timeseries.Quote> quotes = new ArrayList<>();

			Calendar newFrom = (Calendar) to.clone();
			Calendar newTo = (Calendar) to.clone();

			newFrom.add(Calendar.YEAR, -1);

			do
			{
				List<Timeseries.Quote> part = innerGetTimeseries(symbol, newFrom, newTo);

				if (part != null && part.size() > 0)
				{
					quotes.addAll(part);

					Long date = null;

					try
					{
						date = dateFormat.parse(part.get(part.size() - 1).getDate()).getTime();
					}
					catch (ParseException e)
					{
						e.printStackTrace();
					}

					if (date != null)
					{
						newTo.setTimeInMillis(date);
						newTo.add(Calendar.DAY_OF_MONTH, -1);
					}
					else
					{
						newTo = newFrom;
					}
				}
				else
				{
					break;
				}

				newFrom = (Calendar) newTo.clone();
				newFrom.add(Calendar.YEAR, -1);

				if (newFrom.compareTo(from) < 0)
				{
					newFrom = from;
				}
			}
			while (newTo.compareTo(from) > 0);

			return quotes;
		}
		else
		{
			return innerGetTimeseries(symbol, from, to);
		}
	}

	private List<Quote> innerGetTimeseries(String symbol, Calendar from, Calendar to)
	{

		String query = String.format(sql, symbol, dateFormat.format(from.getTime()),
				dateFormat.format(to.getTime()));

		MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
		params.add("q", query);
		params.add("env", environment);
		params.add("format", format);

		Timeseries.Wrapper wrapper = this.getRestOperations().getForObject(buildUri(params),
				Timeseries.Wrapper.class);

		List<Timeseries.Quote> quotes = null;

		try
		{
			Query q = wrapper.getQuery();

			if (q.getCount() > 0)
			{
				quotes = q.getResults().getQuote();
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		return quotes;
	}

	private int daysBetween(Calendar calendar1, Calendar calendar2)
	{
		return (int) ((calendar2.getTimeInMillis() - calendar1.getTimeInMillis()) / (1000 * 60 * 60 * 24));
	}
}
