package org.springframework.social.yahoo.api.impl.json;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.social.yahoo.api.Timeseries;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

class TimeseriesMixin
{
	@JsonIgnoreProperties(ignoreUnknown = true)
	abstract class WrapperMixin extends YahooObjectMixin
	{
		@JsonProperty("query")
		Timeseries.Query query;
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	abstract class QueryMixin extends YahooObjectMixin
	{
		@JsonProperty("count")
		Integer count;
		@JsonProperty("created")
		String created;
		@JsonProperty("lang")
		String lang;
		@JsonProperty("results")
		Timeseries.Results results;
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	abstract class ResultsMixin extends YahooObjectMixin
	{
		@JsonProperty("quote")
		List<Timeseries.Quote> quote;
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	abstract class QuoteMixin extends YahooObjectMixin
	{
		@JsonProperty("Symbol")
		String symbol;
		@JsonProperty("Date")
		String date;
		@JsonProperty("Open")
		BigDecimal open;
		@JsonProperty("High")
		BigDecimal high;
		@JsonProperty("Low")
		BigDecimal low;
		@JsonProperty("Close")
		BigDecimal close;
		@JsonProperty("Volume")
		BigDecimal volume;
		@JsonProperty("Adj_Close")
		BigDecimal adjClose;
	}
}
