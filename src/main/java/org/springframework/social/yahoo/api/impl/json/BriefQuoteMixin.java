package org.springframework.social.yahoo.api.impl.json;

import org.springframework.social.yahoo.api.BriefQuote;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BriefQuoteMixin
{
	@JsonIgnoreProperties(ignoreUnknown = true)
	abstract class WrapperMixin extends GenericWrapperMixin<BriefQuote.Query>
	{
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	abstract class QueryMixin extends GenericQueryMixin<BriefQuote.Results>
	{
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	abstract class ResultsMixin extends GenericResultsMixin<BriefQuote.Quote>
	{
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	abstract class QuoteMixin extends YahooObjectMixin
	{
		@JsonProperty("symbol")
		String symbol;
		@JsonProperty("AverageDailyVolume")
		double AverageDailyVolume;
		@JsonProperty("Change")
		double Change;
		@JsonProperty("DaysLow")
		double DaysLow;
		@JsonProperty("DaysHigh")
		double DaysHigh;
		@JsonProperty("YearLow")
		double YearLow;
		@JsonProperty("YearHigh")
		double YearHigh;
		@JsonProperty("MarketCapitalization")
		String MarketCapitalization;
		@JsonProperty("LastTradePriceOnly")
		double LastTradePriceOnly;
		@JsonProperty("DaysRange")
		String DaysRange;
		@JsonProperty("Name")
		String Name;
		@JsonProperty("Symbol")
		String Symbol;
		@JsonProperty("Volume")
		double Volume;
		@JsonProperty("StockExchange")
		String StockExchange;
	}
}