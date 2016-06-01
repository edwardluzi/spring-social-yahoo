package org.springframework.social.yahoo.api;

import java.io.Serializable;

public abstract class GenericWrapper<T extends GenericQuery<?>> extends YahooObject implements Serializable
{
    private static final long serialVersionUID = 3339880879698802780L;

    private T query;

    public T getQuery()
    {
        return query;
    }

    public void setQuery(T query)
    {
        this.query = query;
    }
}
