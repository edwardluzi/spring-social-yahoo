package org.springframework.social.yahoo.api.impl;

import static org.junit.Assert.assertNotNull;

import java.util.Calendar;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.social.yahoo.api.Timeseries;

@ComponentScan(basePackages = "org.springframework.social.yahoo")
@PropertySource("classpath:application.properties")
public class TimeseriesTest extends AbstractYahooApiTest
{
	private static final Logger logger = Logger.getLogger(TimeseriesTest.class);

	@Test
	public void test()
	{
		Calendar to = Calendar.getInstance();
		Calendar from = (Calendar) to.clone();
		from.add(Calendar.YEAR, -1);

		List<Timeseries.Quote> quotes = yahoo.timeseriesOperations()
				.getTimeseries("GOOD", from, to);

		assertNotNull(quotes);
	}

	@Test
	public void test3Years()
	{
		Calendar to = Calendar.getInstance();
		Calendar from = (Calendar) to.clone();
		from.add(Calendar.YEAR, -3);

		List<Timeseries.Quote> quotes = yahoo.timeseriesOperations().getTimeseries("000001.SZ",
				from, to);

		assertNotNull(quotes);

		assert (quotes.size() > 400);

		for (Timeseries.Quote q : quotes)
		{
			if (q.getVolume() <= 10)
			{
				logger.error(q.getSymbol() + " " + q.getDate());
			}
		}
	}

	@Test
	public void testNullVolume()
	{
		Calendar to = Calendar.getInstance();
		Calendar from = (Calendar) to.clone();
		from.add(Calendar.YEAR, -1);
		
		sleep();
		testNullVolume("600036.SS", from, to);

		sleep();
		testNullVolume("000651.SZ", from, to);

		sleep();
		testNullVolume("000002.SZ", from, to);

		sleep();
		testNullVolume("000001.SZ", from, to);
	}

	private void sleep()
	{
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

	private void testNullVolume(String symbol, Calendar from, Calendar to)
	{
		List<Timeseries.Quote> quotes = yahoo.timeseriesOperations()
				.getTimeseries(symbol, from, to);

		assertNotNull(quotes);

		for (Timeseries.Quote q : quotes)
		{
			if (q.getVolume() <= 10)
			{
				logger.error(q.getSymbol() + " " + q.getDate());
			}
		}
	}
}
