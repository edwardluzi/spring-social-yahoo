package org.springframework.social.yahoo.api;

import java.io.Serializable;

public interface DetailQuote
{
    public class Wrapper extends GenericWrapper<Query>
    {
        private static final long serialVersionUID = -6076224179424346952L;
    }

    public class Query extends GenericQuery<Results>
    {
        private static final long serialVersionUID = -4906478651564110048L;
    }

    public class Results extends GenericResults<Quote>
    {
        private static final long serialVersionUID = -3973823101862419138L;
    }

    public class Quote extends YahooObject implements Serializable
    {
        private static final long serialVersionUID = 5640028489202463236L;

        private String symbol;

        // CHECKSTYLE:OFF

        private double Ask;

        private double AverageDailyVolume;

        private double Bid;

        private Object AskRealtime;

        private Object BidRealtime;

        private double BookValue;

        private String ChangePercentChange;

        private double Change;

        private Object Commission;

        private String Currency;

        private Object ChangeRealtime;

        private Object AfterHoursChangeRealtime;

        private String DividendShare;

        private String LastTradeDate;

        private Object TradeDate;

        private double EarningsShare;

        private Object ErrorIndicationreturnedforsymbolchangedinvalid;

        private double EPSEstimateCurrentYear;

        private double EPSEstimateNextYear;

        private double EPSEstimateNextQuarter;

        private double DaysLow;

        private double DaysHigh;

        private double YearLow;

        private double YearHigh;

        private Object HoldingsGainPercent;

        private Object AnnualizedGain;

        private Object HoldingsGain;

        private Object HoldingsGainPercentRealtime;

        private Object HoldingsGainRealtime;

        private Object MoreInfo;

        private Object OrderBookRealtime;

        private String MarketCapitalization;

        private Object MarketCapRealtime;

        private String EBITDA;

        private double ChangeFromYearLow;

        private String PercentChangeFromYearLow;

        private Object LastTradeRealtimeWithTime;

        private Object ChangePercentRealtime;

        private double ChangeFromYearHigh;

        private String PercebtChangeFromYearHigh;

        private String LastTradeWithTime;

        private double LastTradePriceOnly;

        private Object HighLimit;

        private Object LowLimit;

        private String DaysRange;

        private Object DaysRangeRealtime;

        private double FiftydayMovingAverage;

        private double TwoHundreddayMovingAverage;

        private double ChangeFromTwoHundreddayMovingAverage;

        private String PercentChangeFromTwoHundreddayMovingAverage;

        private double ChangeFromFiftydayMovingAverage;

        private String PercentChangeFromFiftydayMovingAverage;

        private String Name;

        private Object Notes;

        private double Open;

        private double PreviousClose;

        private Object PricePaid;

        private String ChangeinPercent;

        private double PriceSales;

        private double PriceBook;

        private String ExDividendDate;

        private double PERatio;

        private String DividendPayDate;

        private Object PERatioRealtime;

        private double PEGRatio;

        private double PriceEPSEstimateCurrentYear;

        private double PriceEPSEstimateNextYear;

        private Object SharesOwned;

        private double ShortRatio;

        private String LastTradeTime;

        private Object TickerTrend;

        private String OneyrTargetPrice;

        private double Volume;

        private Object HoldingsValue;

        private Object HoldingsValueRealtime;

        private String YearRange;

        private Object DaysValueChange;

        private Object DaysValueChangeRealtime;

        private String StockExchange;

        private String DividendYield;

        private String PercentChange;

        // CHECKSTYLE:ON

        public String getSymbol()
        {
            return symbol;
        }

        public void setSymbol(String symbol)
        {
            this.symbol = symbol;
        }

        public double getAsk()
        {
            return Ask;
        }

        public void setAsk(double ask)
        {
            Ask = ask;
        }

        public double getAverageDailyVolume()
        {
            return AverageDailyVolume;
        }

        public void setAverageDailyVolume(double averageDailyVolume)
        {
            AverageDailyVolume = averageDailyVolume;
        }

        public double getBid()
        {
            return Bid;
        }

        public void setBid(double bid)
        {
            Bid = bid;
        }

        public Object getAskRealtime()
        {
            return AskRealtime;
        }

        public void setAskRealtime(Object askRealtime)
        {
            AskRealtime = askRealtime;
        }

        public Object getBidRealtime()
        {
            return BidRealtime;
        }

        public void setBidRealtime(Object bidRealtime)
        {
            BidRealtime = bidRealtime;
        }

        public double getBookValue()
        {
            return BookValue;
        }

        public void setBookValue(double bookValue)
        {
            BookValue = bookValue;
        }

        public String getChangePercentChange()
        {
            return ChangePercentChange;
        }

        public void setChangePercentChange(String changePercentChange)
        {
            ChangePercentChange = changePercentChange;
        }

        public double getChange()
        {
            return Change;
        }

        public void setChange(double change)
        {
            Change = change;
        }

        public Object getCommission()
        {
            return Commission;
        }

        public void setCommission(Object commission)
        {
            Commission = commission;
        }

        public String getCurrency()
        {
            return Currency;
        }

        public void setCurrency(String currency)
        {
            Currency = currency;
        }

        public Object getChangeRealtime()
        {
            return ChangeRealtime;
        }

        public void setChangeRealtime(Object changeRealtime)
        {
            ChangeRealtime = changeRealtime;
        }

        public Object getAfterHoursChangeRealtime()
        {
            return AfterHoursChangeRealtime;
        }

        public void setAfterHoursChangeRealtime(Object afterHoursChangeRealtime)
        {
            AfterHoursChangeRealtime = afterHoursChangeRealtime;
        }

        public String getDividendShare()
        {
            return DividendShare;
        }

        public void setDividendShare(String dividendShare)
        {
            DividendShare = dividendShare;
        }

        public String getLastTradeDate()
        {
            return LastTradeDate;
        }

        public void setLastTradeDate(String lastTradeDate)
        {
            LastTradeDate = lastTradeDate;
        }

        public Object getTradeDate()
        {
            return TradeDate;
        }

        public void setTradeDate(Object tradeDate)
        {
            TradeDate = tradeDate;
        }

        public double getEarningsShare()
        {
            return EarningsShare;
        }

        public void setEarningsShare(double earningsShare)
        {
            EarningsShare = earningsShare;
        }

        public Object getErrorIndicationreturnedforsymbolchangedinvalid()
        {
            return ErrorIndicationreturnedforsymbolchangedinvalid;
        }

        public void setErrorIndicationreturnedforsymbolchangedinvalid(
                Object errorIndicationreturnedforsymbolchangedinvalid)
        {
            ErrorIndicationreturnedforsymbolchangedinvalid = errorIndicationreturnedforsymbolchangedinvalid;
        }

        // CHECKSTYLE:OFF

        public double getEPSEstimateCurrentYear()
        {
            return EPSEstimateCurrentYear;
        }

        public void setEPSEstimateCurrentYear(double epsEstimateCurrentYear)
        {
            EPSEstimateCurrentYear = epsEstimateCurrentYear;
        }

        public double getEPSEstimateNextYear()
        {
            return EPSEstimateNextYear;
        }

        public void setEPSEstimateNextYear(double epsEstimateNextYear)
        {
            EPSEstimateNextYear = epsEstimateNextYear;
        }

        public double getEPSEstimateNextQuarter()
        {
            return EPSEstimateNextQuarter;
        }

        public void setEPSEstimateNextQuarter(double epsEstimateNextQuarter)
        {
            EPSEstimateNextQuarter = epsEstimateNextQuarter;
        }

        // CHECKSTYLE:ON

        public double getDaysLow()
        {
            return DaysLow;
        }

        public void setDaysLow(double daysLow)
        {
            DaysLow = daysLow;
        }

        public double getDaysHigh()
        {
            return DaysHigh;
        }

        public void setDaysHigh(double daysHigh)
        {
            DaysHigh = daysHigh;
        }

        public double getYearLow()
        {
            return YearLow;
        }

        public void setYearLow(double yearLow)
        {
            YearLow = yearLow;
        }

        public double getYearHigh()
        {
            return YearHigh;
        }

        public void setYearHigh(double yearHigh)
        {
            YearHigh = yearHigh;
        }

        public Object getHoldingsGainPercent()
        {
            return HoldingsGainPercent;
        }

        public void setHoldingsGainPercent(Object holdingsGainPercent)
        {
            HoldingsGainPercent = holdingsGainPercent;
        }

        public Object getAnnualizedGain()
        {
            return AnnualizedGain;
        }

        public void setAnnualizedGain(Object annualizedGain)
        {
            AnnualizedGain = annualizedGain;
        }

        public Object getHoldingsGain()
        {
            return HoldingsGain;
        }

        public void setHoldingsGain(Object holdingsGain)
        {
            HoldingsGain = holdingsGain;
        }

        public Object getHoldingsGainPercentRealtime()
        {
            return HoldingsGainPercentRealtime;
        }

        public void setHoldingsGainPercentRealtime(Object holdingsGainPercentRealtime)
        {
            HoldingsGainPercentRealtime = holdingsGainPercentRealtime;
        }

        public Object getHoldingsGainRealtime()
        {
            return HoldingsGainRealtime;
        }

        public void setHoldingsGainRealtime(Object holdingsGainRealtime)
        {
            HoldingsGainRealtime = holdingsGainRealtime;
        }

        public Object getMoreInfo()
        {
            return MoreInfo;
        }

        public void setMoreInfo(Object moreInfo)
        {
            MoreInfo = moreInfo;
        }

        public Object getOrderBookRealtime()
        {
            return OrderBookRealtime;
        }

        public void setOrderBookRealtime(Object orderBookRealtime)
        {
            OrderBookRealtime = orderBookRealtime;
        }

        public String getMarketCapitalization()
        {
            return MarketCapitalization;
        }

        public void setMarketCapitalization(String marketCapitalization)
        {
            MarketCapitalization = marketCapitalization;
        }

        public Object getMarketCapRealtime()
        {
            return MarketCapRealtime;
        }

        public void setMarketCapRealtime(Object marketCapRealtime)
        {
            MarketCapRealtime = marketCapRealtime;
        }

        // CHECKSTYLE:OFF

        public String getEBITDA()
        {
            return EBITDA;
        }

        public void setEBITDA(String ebitda)
        {
            EBITDA = ebitda;
        }

        // CHECKSTYLE:ON

        public double getChangeFromYearLow()
        {
            return ChangeFromYearLow;
        }

        public void setChangeFromYearLow(double changeFromYearLow)
        {
            ChangeFromYearLow = changeFromYearLow;
        }

        public String getPercentChangeFromYearLow()
        {
            return PercentChangeFromYearLow;
        }

        public void setPercentChangeFromYearLow(String percentChangeFromYearLow)
        {
            PercentChangeFromYearLow = percentChangeFromYearLow;
        }

        public Object getLastTradeRealtimeWithTime()
        {
            return LastTradeRealtimeWithTime;
        }

        public void setLastTradeRealtimeWithTime(Object lastTradeRealtimeWithTime)
        {
            LastTradeRealtimeWithTime = lastTradeRealtimeWithTime;
        }

        public Object getChangePercentRealtime()
        {
            return ChangePercentRealtime;
        }

        public void setChangePercentRealtime(Object changePercentRealtime)
        {
            ChangePercentRealtime = changePercentRealtime;
        }

        public double getChangeFromYearHigh()
        {
            return ChangeFromYearHigh;
        }

        public void setChangeFromYearHigh(double changeFromYearHigh)
        {
            ChangeFromYearHigh = changeFromYearHigh;
        }

        public String getPercebtChangeFromYearHigh()
        {
            return PercebtChangeFromYearHigh;
        }

        public void setPercebtChangeFromYearHigh(String percebtChangeFromYearHigh)
        {
            PercebtChangeFromYearHigh = percebtChangeFromYearHigh;
        }

        public String getLastTradeWithTime()
        {
            return LastTradeWithTime;
        }

        public void setLastTradeWithTime(String lastTradeWithTime)
        {
            LastTradeWithTime = lastTradeWithTime;
        }

        public double getLastTradePriceOnly()
        {
            return LastTradePriceOnly;
        }

        public void setLastTradePriceOnly(double lastTradePriceOnly)
        {
            LastTradePriceOnly = lastTradePriceOnly;
        }

        public Object getHighLimit()
        {
            return HighLimit;
        }

        public void setHighLimit(Object highLimit)
        {
            HighLimit = highLimit;
        }

        public Object getLowLimit()
        {
            return LowLimit;
        }

        public void setLowLimit(Object lowLimit)
        {
            LowLimit = lowLimit;
        }

        public String getDaysRange()
        {
            return DaysRange;
        }

        public void setDaysRange(String daysRange)
        {
            DaysRange = daysRange;
        }

        public Object getDaysRangeRealtime()
        {
            return DaysRangeRealtime;
        }

        public void setDaysRangeRealtime(Object daysRangeRealtime)
        {
            DaysRangeRealtime = daysRangeRealtime;
        }

        public double getFiftydayMovingAverage()
        {
            return FiftydayMovingAverage;
        }

        public void setFiftydayMovingAverage(double fiftydayMovingAverage)
        {
            FiftydayMovingAverage = fiftydayMovingAverage;
        }

        public double getTwoHundreddayMovingAverage()
        {
            return TwoHundreddayMovingAverage;
        }

        public void setTwoHundreddayMovingAverage(double twoHundreddayMovingAverage)
        {
            TwoHundreddayMovingAverage = twoHundreddayMovingAverage;
        }

        public double getChangeFromTwoHundreddayMovingAverage()
        {
            return ChangeFromTwoHundreddayMovingAverage;
        }

        public void setChangeFromTwoHundreddayMovingAverage(double changeFromTwoHundreddayMovingAverage)
        {
            ChangeFromTwoHundreddayMovingAverage = changeFromTwoHundreddayMovingAverage;
        }

        public String getPercentChangeFromTwoHundreddayMovingAverage()
        {
            return PercentChangeFromTwoHundreddayMovingAverage;
        }

        public void setPercentChangeFromTwoHundreddayMovingAverage(String percentChangeFromTwoHundreddayMovingAverage)
        {
            PercentChangeFromTwoHundreddayMovingAverage = percentChangeFromTwoHundreddayMovingAverage;
        }

        public double getChangeFromFiftydayMovingAverage()
        {
            return ChangeFromFiftydayMovingAverage;
        }

        public void setChangeFromFiftydayMovingAverage(double changeFromFiftydayMovingAverage)
        {
            ChangeFromFiftydayMovingAverage = changeFromFiftydayMovingAverage;
        }

        public String getPercentChangeFromFiftydayMovingAverage()
        {
            return PercentChangeFromFiftydayMovingAverage;
        }

        public void setPercentChangeFromFiftydayMovingAverage(String percentChangeFromFiftydayMovingAverage)
        {
            PercentChangeFromFiftydayMovingAverage = percentChangeFromFiftydayMovingAverage;
        }

        public String getName()
        {
            return Name;
        }

        public void setName(String name)
        {
            Name = name;
        }

        public Object getNotes()
        {
            return Notes;
        }

        public void setNotes(Object notes)
        {
            Notes = notes;
        }

        public double getOpen()
        {
            return Open;
        }

        public void setOpen(double open)
        {
            Open = open;
        }

        public double getPreviousClose()
        {
            return PreviousClose;
        }

        public void setPreviousClose(double previousClose)
        {
            PreviousClose = previousClose;
        }

        public Object getPricePaid()
        {
            return PricePaid;
        }

        public void setPricePaid(Object pricePaid)
        {
            PricePaid = pricePaid;
        }

        public String getChangeinPercent()
        {
            return ChangeinPercent;
        }

        public void setChangeinPercent(String changeinPercent)
        {
            ChangeinPercent = changeinPercent;
        }

        public double getPriceSales()
        {
            return PriceSales;
        }

        public void setPriceSales(double priceSales)
        {
            PriceSales = priceSales;
        }

        public double getPriceBook()
        {
            return PriceBook;
        }

        public void setPriceBook(double priceBook)
        {
            PriceBook = priceBook;
        }

        public String getExDividendDate()
        {
            return ExDividendDate;
        }

        public void setExDividendDate(String exDividendDate)
        {
            ExDividendDate = exDividendDate;
        }

        // CHECKSTYLE:OFF

        public double getPERatio()
        {
            return PERatio;
        }

        public void setPERatio(double peRatio)
        {
            PERatio = peRatio;
        }

        public String getDividendPayDate()
        {
            return DividendPayDate;
        }

        public void setDividendPayDate(String dividendPayDate)
        {
            DividendPayDate = dividendPayDate;
        }

        public Object getPERatioRealtime()
        {
            return PERatioRealtime;
        }

        public void setPERatioRealtime(Object peRatioRealtime)
        {
            PERatioRealtime = peRatioRealtime;
        }

        public double getPEGRatio()
        {
            return PEGRatio;
        }

        public void setPEGRatio(double pegRatio)
        {
            PEGRatio = pegRatio;
        }

        public double getPriceEPSEstimateCurrentYear()
        {
            return PriceEPSEstimateCurrentYear;
        }

        public void setPriceEPSEstimateCurrentYear(double priceEpsEstimateCurrentYear)
        {
            PriceEPSEstimateCurrentYear = priceEpsEstimateCurrentYear;
        }

        public double getPriceEPSEstimateNextYear()
        {
            return PriceEPSEstimateNextYear;
        }

        public void setPriceEPSEstimateNextYear(double priceEpsEstimateNextYear)
        {
            PriceEPSEstimateNextYear = priceEpsEstimateNextYear;
        }

        // CHECKSTYLE:ON

        public Object getSharesOwned()
        {
            return SharesOwned;
        }

        public void setSharesOwned(Object sharesOwned)
        {
            SharesOwned = sharesOwned;
        }

        public double getShortRatio()
        {
            return ShortRatio;
        }

        public void setShortRatio(double shortRatio)
        {
            ShortRatio = shortRatio;
        }

        public String getLastTradeTime()
        {
            return LastTradeTime;
        }

        public void setLastTradeTime(String lastTradeTime)
        {
            LastTradeTime = lastTradeTime;
        }

        public Object getTickerTrend()
        {
            return TickerTrend;
        }

        public void setTickerTrend(Object tickerTrend)
        {
            TickerTrend = tickerTrend;
        }

        public String getOneyrTargetPrice()
        {
            return OneyrTargetPrice;
        }

        public void setOneyrTargetPrice(String oneyrTargetPrice)
        {
            OneyrTargetPrice = oneyrTargetPrice;
        }

        public double getVolume()
        {
            return Volume;
        }

        public void setVolume(double volume)
        {
            Volume = volume;
        }

        public Object getHoldingsValue()
        {
            return HoldingsValue;
        }

        public void setHoldingsValue(Object holdingsValue)
        {
            HoldingsValue = holdingsValue;
        }

        public Object getHoldingsValueRealtime()
        {
            return HoldingsValueRealtime;
        }

        public void setHoldingsValueRealtime(Object holdingsValueRealtime)
        {
            HoldingsValueRealtime = holdingsValueRealtime;
        }

        public String getYearRange()
        {
            return YearRange;
        }

        public void setYearRange(String yearRange)
        {
            YearRange = yearRange;
        }

        public Object getDaysValueChange()
        {
            return DaysValueChange;
        }

        public void setDaysValueChange(Object daysValueChange)
        {
            DaysValueChange = daysValueChange;
        }

        public Object getDaysValueChangeRealtime()
        {
            return DaysValueChangeRealtime;
        }

        public void setDaysValueChangeRealtime(Object daysValueChangeRealtime)
        {
            DaysValueChangeRealtime = daysValueChangeRealtime;
        }

        public String getStockExchange()
        {
            return StockExchange;
        }

        public void setStockExchange(String stockExchange)
        {
            StockExchange = stockExchange;
        }

        public String getDividendYield()
        {
            return DividendYield;
        }

        public void setDividendYield(String dividendYield)
        {
            DividendYield = dividendYield;
        }

        public String getPercentChange()
        {
            return PercentChange;
        }

        public void setPercentChange(String percentChange)
        {
            PercentChange = percentChange;
        }
    }
}
