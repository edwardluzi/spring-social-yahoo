package org.springframework.social.yahoo.api.impl.json;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class GenericResultsMixin<T> extends YahooObjectMixin
{
	@JsonProperty("quote")
	List<T> quote;
}
