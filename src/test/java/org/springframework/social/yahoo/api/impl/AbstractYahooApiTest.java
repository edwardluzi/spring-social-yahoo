package org.springframework.social.yahoo.api.impl;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.social.yahoo.api.Yahoo;

public class AbstractYahooApiTest
{
    private AnnotationConfigApplicationContext applicationContext;
    private Environment environment;

    protected Yahoo yahoo;

    @Before
    public void setup()
    {
        applicationContext = new AnnotationConfigApplicationContext(AbstractYahooApiTest.class);
        environment = applicationContext.getEnvironment();

        yahoo = createYahooTemplate();
    }

    @After
    public void tearDown()
    {
        if (applicationContext != null)
        {
            applicationContext.close();
        }
    }

    protected Yahoo createYahooTemplate()
    {
        String consumerKey = environment.getProperty("social.yahoo.consumerKey");
        String consumerSecret = environment.getProperty("social.yahoo.consumerSecret");
        return new YahooTemplate(consumerKey, consumerSecret, "", "");
    }
}
