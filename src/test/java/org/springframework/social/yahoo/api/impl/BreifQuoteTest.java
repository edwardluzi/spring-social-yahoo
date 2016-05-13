package org.springframework.social.yahoo.api.impl;

import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.springframework.social.yahoo.api.BriefQuote;

public class BreifQuoteTest extends AbstractYahooApiTest
{
	@Test
	public void test()
	{
		Set<String> symbols = new HashSet<String>(
				Arrays.asList(new String[] { "GOOG", "000651.SZ" }));

		List<BriefQuote.Quote> quotes = yahoo.briefQuoteOperations().getQuotes(symbols);

		assertNotNull(quotes);
	}
}
