package org.springframework.social.yahoo.api.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.social.yahoo.api.Timeseries;
import org.springframework.social.yahoo.api.Timeseries.Query;
import org.springframework.social.yahoo.api.Timeseries.Quote;
import org.springframework.social.yahoo.api.TimeseriesOperations;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestOperations;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TimeseriesTemplate extends AbstractTemplate implements TimeseriesOperations
{
    private static final Logger logger = Logger.getLogger(TimeseriesTemplate.class);

    private static final String sql = "select * from yahoo.finance.historicaldata "
            + "where symbol = \"%s\" and startDate = \"%s\" and endDate = \"%s\"";
    private static final String environment = "store://datatables.org/alltableswithkeys";
    private static final String format = "json";

    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public TimeseriesTemplate(RestOperations restOperations, ObjectMapper objectMapper, boolean isAuthorized)
    {
        super(restOperations, objectMapper, isAuthorized);
    }

    @Override
    public List<Quote> getTimeseries(String symbol, Calendar from, Calendar to)
    {
        List<Timeseries.Quote> quotes = new ArrayList<>();

        Calendar newTo = (Calendar) to.clone();

        for (;;)
        {
            if (daysBetween(from, newTo) > 366)
            {
                Calendar newFrom = (Calendar) newTo.clone();
                newFrom.add(Calendar.DAY_OF_MONTH, -300);

                List<Timeseries.Quote> part = innerGetTimeseries(symbol, newFrom, newTo);

                if (part != null)
                {
                    quotes.addAll(part);

                    Long date = getLastDate(part);

                    if (date != null)
                    {
                        newTo.setTimeInMillis(date);
                        newTo.add(Calendar.DAY_OF_MONTH, -1);
                    }
                    else
                    {
                        newTo = newFrom;
                        newTo.add(Calendar.DAY_OF_MONTH, -1);
                    }
                }
                else
                {
                    break;
                }
            }
            else
            {
                List<Timeseries.Quote> part = innerGetTimeseries(symbol, from, newTo);

                if (part != null)
                {
                    quotes.addAll(part);
                }
                break;
            }
        }

        return quotes;

    }

    private Long getLastDate(List<Timeseries.Quote> part)
    {
        Long date = null;

        try
        {
            date = dateFormat.parse(part.get(part.size() - 1).getDate()).getTime();
        }
        catch (ParseException e)
        {
            logger.error(e);
        }

        return date;
    }

    private List<Quote> innerGetTimeseries(String symbol, Calendar from, Calendar to)
    {

        String query = String.format(sql, symbol, dateFormat.format(from.getTime()), dateFormat.format(to.getTime()));

        MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
        params.add("q", query);
        params.add("env", environment);
        params.add("format", format);

        Timeseries.Wrapper wrapper = getRestOperations().getForObject(buildUri(params), Timeseries.Wrapper.class);

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
            logger.error(e);
        }

        return quotes;
    }

    private int daysBetween(Calendar calendar1, Calendar calendar2)
    {
        return (int) ((calendar2.getTimeInMillis() - calendar1.getTimeInMillis()) / (1000 * 60 * 60 * 24));
    }
}
