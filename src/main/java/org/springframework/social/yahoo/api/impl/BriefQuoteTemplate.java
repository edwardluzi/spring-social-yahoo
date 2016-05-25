package org.springframework.social.yahoo.api.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.springframework.social.yahoo.api.BriefQuote;
import org.springframework.social.yahoo.api.BriefQuoteOperations;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestOperations;

import com.fasterxml.jackson.databind.ObjectMapper;

public class BriefQuoteTemplate extends AbstractTemplate implements BriefQuoteOperations
{
	private static final Logger logger = Logger.getLogger(BriefQuoteTemplate.class);

	private static final String sql = "select * from yahoo.finance.quote where symbol in (%s) ";
	private static final String environment = "store://datatables.org/alltableswithkeys";
	private static final String format = "json";

	public BriefQuoteTemplate(RestOperations restOperations, ObjectMapper objectMapper,
			boolean isAuthorized)
	{
		super(restOperations, objectMapper, isAuthorized);
	}

	@Override
	public List<BriefQuote.Quote> getQuotes(Collection<String> symbols)
	{
		String symbolsString;

		if (symbols.size() > 1)
		{
			symbolsString = String.join(",", symbols.stream().map(s -> String.format("\"%s\"", s))
					.collect(Collectors.toList()));
		}
		else
		{
			List<String> extras = new ArrayList<>(symbols);

			extras.add("GOOG");

			symbolsString = String.join(",", extras.stream().map(s -> String.format("\"%s\"", s))
					.collect(Collectors.toList()));
		}

		String query = String.format(sql, symbolsString);

		MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
		params.add("q", query);
		params.add("env", environment);
		params.add("format", format);

		BriefQuote.Wrapper wrapper = this.getRestOperations().getForObject(buildUri(params),
				BriefQuote.Wrapper.class);

		List<BriefQuote.Quote> quotes = null;

		try
		{
			BriefQuote.Query q = wrapper.getQuery();

			if (q.getCount() > 0)
			{
				quotes = q.getResults().getQuote();
			}
		}
		catch (Exception e)
		{
			logger.error(e);
		}

		return quotes;
	}
}
