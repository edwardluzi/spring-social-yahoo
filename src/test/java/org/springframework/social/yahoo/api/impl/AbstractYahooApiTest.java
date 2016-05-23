package org.springframework.social.yahoo.api.impl;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.social.yahoo.api.Yahoo;

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
		this.applicationContext = new AnnotationConfigApplicationContext(AbstractYahooApiTest.class);
		this.environment = this.applicationContext.getEnvironment();

		this.yahoo = createYahooTemplate();
	}

	@After
	public void tearDown()
	{
		if (this.applicationContext != null)
		{
			this.applicationContext.close();
		}
	}

	protected Yahoo createYahooTemplate()
	{
		String consumerKey = environment.getProperty("social.yahoo.consumerKey");
		String consumerSecret = environment.getProperty("social.yahoo.consumerSecret");
		return new YahooTemplate(consumerKey, consumerSecret, "", "");
	}
}
