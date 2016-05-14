package org.springframework.social.yahoo.api.impl;

import static org.junit.Assert.assertNotNull;

import java.util.Calendar;
import java.util.List;

import org.junit.Test;
import org.springframework.social.yahoo.api.Timeseries;

public class TimeseriesTest extends AbstractYahooApiTest
{
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

		List<Timeseries.Quote> quotes = yahoo.timeseriesOperations()
				.getTimeseries("GOOD", from, to);

		assertNotNull(quotes);

		assert (quotes.size() > 400);

		for (Timeseries.Quote q : quotes)
		{
			assert (q.getVolume() > 10);
			
			if (q.getVolume() <= 10)
			{
				System.out.print(q.getDate());
			}
		}
	}

	@Test
	public void testNullVolume()
	{
		Calendar to = Calendar.getInstance();
		Calendar from = (Calendar) to.clone();
		from.add(Calendar.YEAR, -3);

		testNullVolume("000651.SZ", from, to);
		testNullVolume("000002.SZ", from, to);
		testNullVolume("000001.SZ", from, to);
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
				System.out.print(q.getDate());
			}
		}
	}
}
