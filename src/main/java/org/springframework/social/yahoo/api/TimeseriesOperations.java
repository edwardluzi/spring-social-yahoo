package org.springframework.social.yahoo.api;

import java.util.Calendar;
import java.util.List;

public interface TimeseriesOperations
{
	List<Timeseries.Quote> getTimeseries(String symbol, Calendar from, Calendar to);
}
