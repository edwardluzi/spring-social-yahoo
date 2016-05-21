package org.springframework.social.yahoo.api.impl;

import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.social.oauth1.AbstractOAuth1ApiBinding;
import org.springframework.social.support.ClientHttpRequestFactorySelector;
import org.springframework.social.yahoo.api.BriefQuoteOperations;
import org.springframework.social.yahoo.api.DetailQuoteOperations;
import org.springframework.social.yahoo.api.TimeseriesOperations;
import org.springframework.social.yahoo.api.Yahoo;
import org.springframework.social.yahoo.api.impl.json.YahooModule;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

public class YahooTemplate extends AbstractOAuth1ApiBinding implements Yahoo
{
	private TimeseriesOperations timeseriesOperations;
	private BriefQuoteOperations briefQuoteOperations;
	private DetailQuoteOperations detailQuoteOperations;
	private ObjectMapper objectMapper;

	public YahooTemplate(String consumerKey, String consumerSecret, String accessToken, String accessTokenSecret)
	{
		super(consumerKey, consumerSecret, accessToken, accessTokenSecret);
		initialize();
	}
	
	public YahooTemplate()
	{
		initialize();
	}

	public TimeseriesOperations timeseriesOperations()
	{
		return timeseriesOperations;
	}

	public BriefQuoteOperations briefQuoteOperations()
	{
		return briefQuoteOperations;
	}

	public DetailQuoteOperations detailQuoteOperations()
	{
		return detailQuoteOperations;
	}

	public RestOperations restOperations()
	{
		return getRestTemplate();
	}

	protected ObjectMapper getObjectMapper()
	{
		return objectMapper;
	}
	
	

	@Override
	public void setRequestFactory(ClientHttpRequestFactory requestFactory)
	{
		// Wrap the request factory with a BufferingClientHttpRequestFactory so
		// that the error handler can do repeat reads on the response.getBody()
		super.setRequestFactory(ClientHttpRequestFactorySelector.bufferRequests(requestFactory));
	}

	@Override
	protected void configureRestTemplate(RestTemplate restTemplate)
	{
		super.configureRestTemplate(restTemplate);
		restTemplate.setErrorHandler(new YahooErrorHandler());
	}

	@Override
	protected MappingJackson2HttpMessageConverter getJsonMessageConverter()
	{
		MappingJackson2HttpMessageConverter converter = super.getJsonMessageConverter();
		objectMapper = new ObjectMapper();
		objectMapper.registerModule(new YahooModule());
		converter.setObjectMapper(objectMapper);
		return converter;
	}

	private void initialize()
	{
		// Wrap the request factory with a BufferingClientHttpRequestFactory so
		// that the error handler can do repeat reads on the response.getBody()
		super.setRequestFactory(ClientHttpRequestFactorySelector.bufferRequests(getRestTemplate()
				.getRequestFactory()));
		initSubApis();
	}

	private void initSubApis()
	{
		this.timeseriesOperations = new TimeseriesTemplate(getRestTemplate(), objectMapper,
				isAuthorized());

		this.briefQuoteOperations = new BriefQuoteTemplate(getRestTemplate(), objectMapper,
				isAuthorized());

		this.detailQuoteOperations = new DetailQuoteTemplate(getRestTemplate(), objectMapper,
				isAuthorized());
	}

	
}
