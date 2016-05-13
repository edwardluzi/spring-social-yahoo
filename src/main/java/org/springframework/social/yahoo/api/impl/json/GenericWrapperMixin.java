package org.springframework.social.yahoo.api.impl.json;

import org.springframework.social.yahoo.api.GenericQuery;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class GenericWrapperMixin<T extends GenericQuery<?>> extends YahooObjectMixin
{
	@JsonProperty("query")
	private T query;
}