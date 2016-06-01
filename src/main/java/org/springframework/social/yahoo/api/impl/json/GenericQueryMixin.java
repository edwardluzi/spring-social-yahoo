package org.springframework.social.yahoo.api.impl.json;

import org.springframework.social.yahoo.api.GenericResults;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class GenericQueryMixin<T extends GenericResults<?>> extends YahooObjectMixin
{
    @JsonProperty("count")
    Integer count;
    @JsonProperty("created")
    String created;
    @JsonProperty("lang")
    String lang;
    @JsonProperty("results")
    T results;
}
