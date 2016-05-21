package org.springframework.social.yahoo.connect;

import org.springframework.social.connect.support.OAuth1ConnectionFactory;
import org.springframework.social.yahoo.api.Yahoo;

public class YahooConnectionFactory extends OAuth1ConnectionFactory<Yahoo>
{
	public YahooConnectionFactory(String consumerKey, String consumerSecret)
	{
		super("yahoo", new YahooServiceProvider(consumerKey, consumerSecret), new YahooAdapter());
	}
}
