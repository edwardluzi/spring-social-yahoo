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
	}
}
