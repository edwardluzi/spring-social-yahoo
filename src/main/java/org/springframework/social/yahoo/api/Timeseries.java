package org.springframework.social.yahoo.api;

import java.io.Serializable;

public interface Timeseries
{
    public class Wrapper extends GenericWrapper<Query>
    {
        private static final long serialVersionUID = -201846175688566282L;
    }

    public class Query extends GenericQuery<Results>
    {
        private static final long serialVersionUID = 6632239858447754557L;
    }

    public class Results extends GenericResults<Quote>
    {
        private static final long serialVersionUID = 1236344281228167273L;
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
