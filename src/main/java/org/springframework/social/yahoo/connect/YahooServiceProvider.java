package org.springframework.social.yahoo.connect;

import org.springframework.social.oauth1.AbstractOAuth1ServiceProvider;
import org.springframework.social.oauth1.OAuth1Template;
import org.springframework.social.yahoo.api.Yahoo;
import org.springframework.social.yahoo.api.impl.YahooTemplate;

public class YahooServiceProvider extends AbstractOAuth1ServiceProvider<Yahoo>
{
    public YahooServiceProvider(String consumerKey, String consumerSecret)
    {
        super(consumerKey, consumerSecret, getOAuth1Template(consumerKey, consumerSecret));
    }

    private static OAuth1Template getOAuth1Template(String consumerKey, String consumerSecret)
    {
        OAuth1Template oauth1Template = new OAuth1Template(consumerKey, consumerSecret,
                "https://api.login.yahoo.com/oauth/v2/get_request_token",
                "https://api.login.yahoo.com/oauth/v2/request_auth", "https://api.login.yahoo.com/oauth/v2/get_token");
        return oauth1Template;
    }

    @Override
    public Yahoo getApi(String accessToken, String secret)
    {
        return new YahooTemplate(getConsumerKey(), getConsumerSecret(), accessToken, secret);
    }
}
