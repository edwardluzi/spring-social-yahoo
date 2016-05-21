package org.springframework.social.yahoo.api.impl;

import org.junit.Before;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.social.oauth1.OAuthToken;
import org.springframework.social.yahoo.api.Yahoo;
import org.springframework.social.yahoo.api.connect.ServiceProviderTest;
import org.springframework.social.yahoo.connect.YahooServiceProvider;

@ComponentScan(basePackages = "org.springframework.social.yahoo")
@PropertySource("classpath:application.properties")
public class AbstractYahooApiTest
{
	private AnnotationConfigApplicationContext applicationContext;
	private Environment environment;

	protected Yahoo yahoo;

	@Before
	public void setup()
	{
		this.applicationContext = new AnnotationConfigApplicationContext(ServiceProviderTest.class);
		this.environment = this.applicationContext.getEnvironment();

		this.yahoo = createYahooTemplate();
	}

	protected Yahoo createYahooTemplate()
	{
		String consumerKey = environment.getProperty("yahoo.consumerKey");
		String consumerSecret = environment.getProperty("yahoo.consumerSecret");

		YahooServiceProvider provider = new YahooServiceProvider(consumerKey, consumerSecret);
		OAuthToken token = provider.getOAuthOperations().fetchRequestToken("oob", null);

		return provider.getApi(token.getValue(), token.getSecret());
	}
}
