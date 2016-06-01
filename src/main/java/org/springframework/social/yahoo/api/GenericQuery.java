package org.springframework.social.yahoo.api;

import java.io.Serializable;

public abstract class GenericQuery<T extends GenericResults<?>> extends YahooObject implements Serializable
{
    private static final long serialVersionUID = -3373741287124356799L;

    private Integer count;

    private String created;

    private String lang;

    private T results;

    public Integer getCount()
    {
        return count;
    }

    public void setCount(Integer count)
    {
        this.count = count;
    }

    public String getCreated()
    {
        return created;
    }

    public void setCreated(String created)
    {
        this.created = created;
    }

    public String getLang()
    {
        return lang;
    }

    public void setLang(String lang)
    {
        this.lang = lang;
    }

    public T getResults()
    {
        return results;
    }

    public void setResults(T results)
    {
        this.results = results;
    }
}