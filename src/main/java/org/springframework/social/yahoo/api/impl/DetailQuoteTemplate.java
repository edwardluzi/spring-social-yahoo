package org.springframework.social.yahoo.api.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.social.yahoo.api.DetailQuote;
import org.springframework.social.yahoo.api.DetailQuoteOperations;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestOperations;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DetailQuoteTemplate extends AbstractTemplate implements DetailQuoteOperations
{
	private static final String sql = "select * from yahoo.finance.quotes where symbol in (%s) ";
	private static final String environment = "store://datatables.org/alltableswithkeys";
	private static final String format = "json";

	public DetailQuoteTemplate(RestOperations restOperations, ObjectMapper objectMapper,
			boolean isAuthorized)
	{
		super(restOperations, objectMapper, isAuthorized);
	}

	@Override
	public List<DetailQuote.Quote> getQuotes(Collection<String> symbols)
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

		DetailQuote.Wrapper wrapper = this.getRestOperations().getForObject(buildUri(params),
				DetailQuote.Wrapper.class);

		List<DetailQuote.Quote> quotes = null;

		try
		{
			DetailQuote.Query q = wrapper.getQuery();

			if (q.getCount() > 0)
			{
				quotes = q.getResults().getQuote();
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		return quotes;
	}
}
