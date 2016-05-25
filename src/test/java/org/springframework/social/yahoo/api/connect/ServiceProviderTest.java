package org.springframework.social.yahoo.api.connect;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.social.oauth1.OAuthToken;
import org.springframework.social.yahoo.connect.YahooServiceProvider;

@ComponentScan(basePackages = "org.springframework.social.yahoo")
@PropertySource("classpath:application.properties")
public class ServiceProviderTest
{
	private AnnotationConfigApplicationContext applicationContext;
	private Environment environment;

	@Before
	public void setup()
	{
		this.applicationContext = new AnnotationConfigApplicationContext(ServiceProviderTest.class);
		this.environment = this.applicationContext.getEnvironment();
	}

	@After
	public void tearDown()
	{
		if (this.applicationContext != null)
		{
			this.applicationContext.close();
		}
	}

	@Test
	public void testConnect()
	{
		String consumerKey = environment.getProperty("social.yahoo.consumerKey");
		String consumerSecret = environment.getProperty("social.yahoo.consumerSecret");

		YahooServiceProvider provider = new YahooServiceProvider(consumerKey, consumerSecret);

		OAuthToken requestToken = provider.getOAuthOperations().fetchRequestToken("oob", null);

		assertNotNull(requestToken);
	}
}
