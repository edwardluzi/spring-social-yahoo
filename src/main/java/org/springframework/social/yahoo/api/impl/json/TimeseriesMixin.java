package org.springframework.social.yahoo.api.impl.json;

import org.springframework.social.yahoo.api.Timeseries;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

class TimeseriesMixin
{
	@JsonIgnoreProperties(ignoreUnknown = true)
	abstract class WrapperMixin extends GenericWrapperMixin<Timeseries.Query>
	{
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	abstract class QueryMixin extends GenericQueryMixin<Timeseries.Results>
	{
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	abstract class ResultsMixin extends GenericResultsMixin<Timeseries.Quote>
	{
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	abstract class QuoteMixin extends YahooObjectMixin
	{
		@JsonProperty("Symbol")
		String symbol;
		@JsonProperty("Date")
		String date;
		@JsonProperty("Open")
		double open;
		@JsonProperty("High")
		double high;
		@JsonProperty("Low")
		double low;
		@JsonProperty("Close")
		double close;
		@JsonProperty("Volume")
		double volume;
		@JsonProperty("Adj_Close")
		double adjClose;
	}
}
