package org.springframework.social.yahoo.api;

import java.io.Serializable;

public interface BriefQuote
{
    public class Wrapper extends GenericWrapper<Query>
    {
        private static final long serialVersionUID = -6494514044922624303L;
    }

    public class Query extends GenericQuery<Results>
    {
        private static final long serialVersionUID = 8275023150867310480L;
    }

    public class Results extends GenericResults<Quote>
    {
        private static final long serialVersionUID = 1897053480756272494L;
    }

    public class Quote extends YahooObject implements Serializable
    {
        private static final long serialVersionUID = -2052211893583803445L;

        private String symbol;

        // CHECKSTYLE:OFF
        private double AverageDailyVolume;

        private double Change;

        private double DaysLow;

        private double DaysHigh;

        private double YearLow;

        private double YearHigh;

        private String MarketCapitalization;

        private double LastTradePriceOnly;

        private String DaysRange;

        private String Name;

        private double Volume;

        private String StockExchange;

        // CHECKSTYLE:ON

        public String getSymbol()
        {
            return symbol;
        }

        public void setSymbol(String symbol)
        {
            this.symbol = symbol;
        }

        public double getAverageDailyVolume()
        {
            return AverageDailyVolume;
        }

        public void setAverageDailyVolume(double averageDailyVolume)
        {
            this.AverageDailyVolume = averageDailyVolume;
        }

        public double getChange()
        {
            return Change;
        }

        public void setChange(double change)
        {
            this.Change = change;
        }

        public double getDaysLow()
        {
            return DaysLow;
        }

        public void setDaysLow(double daysLow)
        {
            this.DaysLow = daysLow;
        }

        public double getDaysHigh()
        {
            return DaysHigh;
        }

        public void setDaysHigh(double daysHigh)
        {
            this.DaysHigh = daysHigh;
        }

        public double getYearLow()
        {
            return YearLow;
        }

        public void setYearLow(double yearLow)
        {
            this.YearLow = yearLow;
        }

        public double getYearHigh()
        {
            return YearHigh;
        }

        public void setYearHigh(double yearHigh)
        {
            this.YearHigh = yearHigh;
        }

        public String getMarketCapitalization()
        {
            return MarketCapitalization;
        }

        public void setMarketCapitalization(String marketCapitalization)
        {
            this.MarketCapitalization = marketCapitalization;
        }

        public double getLastTradePriceOnly()
        {
            return LastTradePriceOnly;
        }

        public void setLastTradePriceOnly(double lastTradePriceOnly)
        {
            this.LastTradePriceOnly = lastTradePriceOnly;
        }

        public String getDaysRange()
        {
            return DaysRange;
        }

        public void setDaysRange(String daysRange)
        {
            this.DaysRange = daysRange;
        }

        public String getName()
        {
            return Name;
        }

        public void setName(String name)
        {
            this.Name = name;
        }

        public double getVolume()
        {
            return Volume;
        }

        public void setVolume(double volume)
        {
            this.Volume = volume;
        }

        public String getStockExchange()
        {
            return StockExchange;
        }

        public void setStockExchange(String stockExchange)
        {
            this.StockExchange = stockExchange;
        }
    }
}