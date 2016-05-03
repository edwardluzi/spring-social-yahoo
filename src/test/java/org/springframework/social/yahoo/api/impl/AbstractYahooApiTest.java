package org.springframework.social.yahoo.api.impl;


import org.junit.Before;


public class AbstractYahooApiTest
{
	protected YahooTemplate yahoo;

	@Before
	public void setup()
	{
		yahoo = createYahooTemplate();
	}

	protected YahooTemplate createYahooTemplate()
	{
		return new YahooTemplate();
	}
}
