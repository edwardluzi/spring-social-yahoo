package org.springframework.social.yahoo.connect;

import java.util.Arrays;

import org.springframework.social.ApiException;
import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.yahoo.api.Yahoo;

public class YahooAdapter implements ApiAdapter<Yahoo>
{

    @Override
    public boolean test(Yahoo api)
    {
        try
        {
            api.briefQuoteOperations().getQuotes(Arrays.asList(new String[] { "YHOO" }));
            return true;
        }
        catch (ApiException e)
        {
            return false;
        }
    }

    @Override
    public void setConnectionValues(Yahoo api, ConnectionValues values)
    {
    }

    @Override
    public UserProfile fetchUserProfile(Yahoo api)
    {
        return null;
    }

    @Override
    public void updateStatus(Yahoo api, String message)
    {
    }
}
