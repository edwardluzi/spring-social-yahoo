package org.springframework.social.yahoo.api;

import java.io.Serializable;
import java.util.List;

public interface Timeseries
{
	public class Wrapper extends YahooObject implements Serializable
	{
		private static final long serialVersionUID = -608818125778803861L;

		private Query query;

		public Query getQuery()
		{
			return query;
		}

		public void setQuery(Query query)
		{
			this.query = query;
		}
	}

	public class Query extends YahooObject implements Serializable
	{
		private static final long serialVersionUID = 7449812018996526556L;

		private Integer count;

		private String created;

		private String lang;

		private Results results;

		public Integer getCount()
		{
			return count;
		}

		public void setCount(Integer count)
		{
			this.count = count;
		}

		public String getCreated()
		{
			return created;
		}

		public void setCreated(String created)
		{
			this.created = created;
		}

		public String getLang()
		{
			return lang;
		}

		public void setLang(String lang)
		{
			this.lang = lang;
		}

		public Results getResults()
		{
			return results;
		}

		public void setResults(Results results)
		{
			this.results = results;
		}
	}

	public class Results extends YahooObject implements Serializable
	{
		private static final long serialVersionUID = 5300093125284344989L;

		private List<Quote> quote;

		public List<Quote> getQuote()
		{
			return quote;
		}

		public void setQuote(List<Quote> quote)
		{
			this.quote = quote;
		}
	}

	public class Quote extends YahooObject implements Serializable
	{
		private static final long serialVersionUID = -6929959130246708722L;

		private String symbol;

		private String date;

		private double open;

		private double high;

		private double low;

		private double close;

		private double volume;

		private double adjClose;

		public String getSymbol()
		{
			return symbol;
		}

		public void setSymbol(String symbol)
		{
			this.symbol = symbol;
		}

		public String getDate()
		{
			return date;
		}

		public void setDate(String date)
		{
			this.date = date;
		}

		public double getOpen()
		{
			return open;
		}

		public void setOpen(double open)
		{
			this.open = open;
		}

		public double getHigh()
		{
			return high;
		}

		public void setHigh(double high)
		{
			this.high = high;
		}

		public double getLow()
		{
			return low;
		}

		public void setLow(double low)
		{
			this.low = low;
		}

		public double getClose()
		{
			return close;
		}

		public void setClose(double close)
		{
			this.close = close;
		}

		public double getVolume()
		{
			return volume;
		}

		public void setVolume(double volume)
		{
			this.volume = volume;
		}

		public double getAdjClose()
		{
			return adjClose;
		}

		public void setAdjClose(double adjClose)
		{
			this.adjClose = adjClose;
		}
	}
}
