package org.springframework.social.yahoo.api.impl;

import java.text.SimpleDateFormat;
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

	public TimeseriesTemplate(RestOperations restOperations, ObjectMapper objectMapper,
			boolean isAuthorized)
	{
		super(restOperations, objectMapper, isAuthorized);
	}

	public List<Quote> getTimeseries(String symbol, Calendar from, Calendar to)
	{
		normalizeCalendar(from);
		normalizeCalendar(to);

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
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

	private Calendar normalizeCalendar(Calendar cal)
	{
		cal.set(Calendar.MILLISECOND, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.HOUR, 0);

		return cal;
	}
}
