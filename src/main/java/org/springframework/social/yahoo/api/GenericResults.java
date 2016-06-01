package org.springframework.social.yahoo.api;

import java.io.Serializable;
import java.util.List;

public abstract class GenericResults<T> extends YahooObject implements Serializable
{
    private static final long serialVersionUID = -1096688665588928704L;

    private List<T> quote;

    public List<T> getQuote()
    {
        return quote;
    }

    public void setQuote(List<T> quote)
    {
        this.quote = quote;
    }
}