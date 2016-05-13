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

		public void setAverageDailyVolume(double AverageDailyVolume)
		{
			this.AverageDailyVolume = AverageDailyVolume;
		}

		public double getChange()
		{
			return Change;
		}

		public void setChange(double Change)
		{
			this.Change = Change;
		}

		public double getDaysLow()
		{
			return DaysLow;
		}

		public void setDaysLow(double DaysLow)
		{
			this.DaysLow = DaysLow;
		}

		public double getDaysHigh()
		{
			return DaysHigh;
		}

		public void setDaysHigh(double DaysHigh)
		{
			this.DaysHigh = DaysHigh;
		}

		public double getYearLow()
		{
			return YearLow;
		}

		public void setYearLow(double YearLow)
		{
			this.YearLow = YearLow;
		}

		public double getYearHigh()
		{
			return YearHigh;
		}

		public void setYearHigh(double YearHigh)
		{
			this.YearHigh = YearHigh;
		}

		public String getMarketCapitalization()
		{
			return MarketCapitalization;
		}

		public void setMarketCapitalization(String MarketCapitalization)
		{
			this.MarketCapitalization = MarketCapitalization;
		}

		public double getLastTradePriceOnly()
		{
			return LastTradePriceOnly;
		}

		public void setLastTradePriceOnly(double LastTradePriceOnly)
		{
			this.LastTradePriceOnly = LastTradePriceOnly;
		}

		public String getDaysRange()
		{
			return DaysRange;
		}

		public void setDaysRange(String DaysRange)
		{
			this.DaysRange = DaysRange;
		}

		public String getName()
		{
			return Name;
		}

		public void setName(String Name)
		{
			this.Name = Name;
		}

		public double getVolume()
		{
			return Volume;
		}

		public void setVolume(double Volume)
		{
			this.Volume = Volume;
		}

		public String getStockExchange()
		{
			return StockExchange;
		}

		public void setStockExchange(String StockExchange)
		{
			this.StockExchange = StockExchange;
		}
	}
}