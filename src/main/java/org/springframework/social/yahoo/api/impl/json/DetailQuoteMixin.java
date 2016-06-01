package org.springframework.social.yahoo.api.impl.json;

import org.springframework.social.yahoo.api.DetailQuote;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DetailQuoteMixin
{
    @JsonIgnoreProperties(ignoreUnknown = true)
    abstract class WrapperMixin extends GenericWrapperMixin<DetailQuote.Query>
    {
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    abstract class QueryMixin extends GenericQueryMixin<DetailQuote.Results>
    {
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    abstract class ResultsMixin extends GenericResultsMixin<DetailQuote.Quote>
    {
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    abstract class QuoteMixin extends YahooObjectMixin
    {
        @JsonProperty("symbol")
        String symbol;
        @JsonProperty("Ask")
        double Ask;
        @JsonProperty("AverageDailyVolume")
        double AverageDailyVolume;
        @JsonProperty("Bid")
        double Bid;
        @JsonProperty("AskRealtime")
        Object AskRealtime;
        @JsonProperty("BidRealtime")
        Object BidRealtime;
        @JsonProperty("BookValue")
        double BookValue;
        @JsonProperty("Change_PercentChange")
        String ChangePercentChange;
        @JsonProperty("Change")
        double Change;
        @JsonProperty("Commission")
        Object Commission;
        @JsonProperty("Currency")
        String Currency;
        @JsonProperty("ChangeRealtime")
        Object ChangeRealtime;
        @JsonProperty("AfterHoursChangeRealtime")
        Object AfterHoursChangeRealtime;
        @JsonProperty("DividendShare")
        String DividendShare;
        @JsonProperty("LastTradeDate")
        String LastTradeDate;
        @JsonProperty("TradeDate")
        Object TradeDate;
        @JsonProperty("EarningsShare")
        double EarningsShare;
        @JsonProperty("ErrorIndicationreturnedforsymbolchangedinvalid")
        Object ErrorIndicationreturnedforsymbolchangedinvalid;
        @JsonProperty("EPSEstimateCurrentYear")
        double EPSEstimateCurrentYear;
        @JsonProperty("EPSEstimateNextYear")
        double EPSEstimateNextYear;
        @JsonProperty("EPSEstimateNextQuarter")
        double EPSEstimateNextQuarter;
        @JsonProperty("DaysLow")
        double DaysLow;
        @JsonProperty("DaysHigh")
        double DaysHigh;
        @JsonProperty("YearLow")
        double YearLow;
        @JsonProperty("YearHigh")
        double YearHigh;
        @JsonProperty("HoldingsGainPercent")
        Object HoldingsGainPercent;
        @JsonProperty("AnnualizedGain")
        Object AnnualizedGain;
        @JsonProperty("HoldingsGain")
        Object HoldingsGain;
        @JsonProperty("HoldingsGainPercentRealtime")
        Object HoldingsGainPercentRealtime;
        @JsonProperty("HoldingsGainRealtime")
        Object HoldingsGainRealtime;
        @JsonProperty("MoreInfo")
        Object MoreInfo;
        @JsonProperty("OrderBookRealtime")
        Object OrderBookRealtime;
        @JsonProperty("MarketCapitalization")
        String MarketCapitalization;
        @JsonProperty("MarketCapRealtime")
        Object MarketCapRealtime;
        @JsonProperty("EBITDA")
        String EBITDA;
        @JsonProperty("ChangeFromYearLow")
        double ChangeFromYearLow;
        @JsonProperty("PercentChangeFromYearLow")
        String PercentChangeFromYearLow;
        @JsonProperty("LastTradeRealtimeWithTime")
        Object LastTradeRealtimeWithTime;
        @JsonProperty("ChangePercentRealtime")
        Object ChangePercentRealtime;
        @JsonProperty("ChangeFromYearHigh")
        double ChangeFromYearHigh;
        @JsonProperty("PercebtChangeFromYearHigh")
        String PercebtChangeFromYearHigh;
        @JsonProperty("LastTradeWithTime")
        String LastTradeWithTime;
        @JsonProperty("LastTradePriceOnly")
        double LastTradePriceOnly;
        @JsonProperty("HighLimit")
        Object HighLimit;
        @JsonProperty("LowLimit")
        Object LowLimit;
        @JsonProperty("DaysRange")
        String DaysRange;
        @JsonProperty("DaysRangeRealtime")
        Object DaysRangeRealtime;
        @JsonProperty("FiftydayMovingAverage")
        double FiftydayMovingAverage;
        @JsonProperty("TwoHundreddayMovingAverage")
        double TwoHundreddayMovingAverage;
        @JsonProperty("ChangeFromTwoHundreddayMovingAverage")
        double ChangeFromTwoHundreddayMovingAverage;
        @JsonProperty("PercentChangeFromTwoHundreddayMovingAverage")
        String PercentChangeFromTwoHundreddayMovingAverage;
        @JsonProperty("ChangeFromFiftydayMovingAverage")
        double ChangeFromFiftydayMovingAverage;
        @JsonProperty("PercentChangeFromFiftydayMovingAverage")
        String PercentChangeFromFiftydayMovingAverage;
        @JsonProperty("Name")
        String Name;
        @JsonProperty("Notes")
        Object Notes;
        @JsonProperty("Open")
        double Open;
        @JsonProperty("PreviousClose")
        double PreviousClose;
        @JsonProperty("PricePaid")
        Object PricePaid;
        @JsonProperty("ChangeinPercent")
        String ChangeinPercent;
        @JsonProperty("PriceSales")
        double PriceSales;
        @JsonProperty("PriceBook")
        double PriceBook;
        @JsonProperty("ExDividendDate")
        String ExDividendDate;
        @JsonProperty("PERatio")
        double PERatio;
        @JsonProperty("DividendPayDate")
        String DividendPayDate;
        @JsonProperty("PERatioRealtime")
        Object PERatioRealtime;
        @JsonProperty("PEGRatio")
        double PEGRatio;
        @JsonProperty("PriceEPSEstimateCurrentYear")
        double PriceEPSEstimateCurrentYear;
        @JsonProperty("PriceEPSEstimateNextYear")
        double PriceEPSEstimateNextYear;
        @JsonProperty("Symbol")
        String Symbol;
        @JsonProperty("SharesOwned")
        Object SharesOwned;
        @JsonProperty("ShortRatio")
        double ShortRatio;
        @JsonProperty("LastTradeTime")
        String LastTradeTime;
        @JsonProperty("TickerTrend")
        Object TickerTrend;
        @JsonProperty("OneyrTargetPrice")
        String OneyrTargetPrice;
        @JsonProperty("Volume")
        double Volume;
        @JsonProperty("HoldingsValue")
        Object HoldingsValue;
        @JsonProperty("HoldingsValueRealtime")
        Object HoldingsValueRealtime;
        @JsonProperty("YearRange")
        String YearRange;
        @JsonProperty("DaysValueChange")
        Object DaysValueChange;
        @JsonProperty("DaysValueChangeRealtime")
        Object DaysValueChangeRealtime;
        @JsonProperty("StockExchange")
        String StockExchange;
        @JsonProperty("DividendYield")
        String DividendYield;
        @JsonProperty("PercentChange")
        String PercentChange;
    }
}
