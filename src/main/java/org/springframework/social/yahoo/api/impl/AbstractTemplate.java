package org.springframework.social.yahoo.api.impl;

import java.net.URI;

import org.springframework.social.MissingAuthorizationException;
import org.springframework.social.support.URIBuilder;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestOperations;

import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class AbstractTemplate
{
    private static final String API_URL_BASE = "http://query.yahooapis.com/v1/yql";

    private final RestOperations restOperations;
    private final ObjectMapper objectMapper;
    private final boolean isAuthorized;

    protected RestOperations getRestOperations()
    {
        return restOperations;
    }

    protected ObjectMapper getObjectMapper()
    {
        return objectMapper;
    }

    protected AbstractTemplate(RestOperations restOperations, ObjectMapper objectMapper, boolean isAuthorized)
    {
        this.restOperations = restOperations;
        this.objectMapper = objectMapper;
        this.isAuthorized = isAuthorized;
    }

    protected void requireAuthorization()
    {
        if (!isAuthorized)
        {
            throw new MissingAuthorizationException("yahoo");
        }
    }

    protected URI buildUri(MultiValueMap<String, String> params)
    {
        return URIBuilder.fromUri(API_URL_BASE).queryParams(params).build();
    }
}
