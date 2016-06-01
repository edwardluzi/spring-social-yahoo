package org.springframework.social.yahoo.api;

import java.util.HashMap;
import java.util.Map;

public abstract class YahooObject
{
    private Map<String, Object> extraData;

    public YahooObject()
    {
        extraData = new HashMap<String, Object>();
    }

    public Map<String, Object> getExtraData()
    {
        return extraData;
    }

    protected void add(String key, Object value)
    {
        extraData.put(key, value);
    }
}
