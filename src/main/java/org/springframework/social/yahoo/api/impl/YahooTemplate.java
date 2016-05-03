package org.springframework.social.yahoo.api.impl;


import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.support.ClientHttpRequestFactorySelector;
import org.springframework.social.yahoo.api.TimeseriesOperations;
import org.springframework.social.yahoo.api.Yahoo;
import org.springframework.social.yahoo.api.impl.json.YahooModule;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

public class YahooTemplate extends AbstractOAuth2ApiBinding implements Yahoo
{
	private TimeseriesOperations timeseriesOperations;
	private ObjectMapper objectMapper;

	public YahooTemplate(String accessToken)
	{
		super(accessToken);
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
	}
}
