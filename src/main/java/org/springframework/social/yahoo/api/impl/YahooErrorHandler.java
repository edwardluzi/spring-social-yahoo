package org.springframework.social.yahoo.api.impl;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.social.UncategorizedApiException;
import org.springframework.web.client.DefaultResponseErrorHandler;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class YahooErrorHandler extends DefaultResponseErrorHandler
{
	@Override
	public void handleError(ClientHttpResponse response) throws IOException
	{
		HttpStatus statusCode = response.getStatusCode();
		Map<String, Object> errorDetails = extractErrorDetailsFromResponse(response);

		if (statusCode.series().equals(HttpStatus.Series.CLIENT_ERROR))
		{
			String errorMessage = "Unknown error";

			if (errorDetails.containsKey("error"))
			{
				Object errorObject = errorDetails.get("error");

				if (errorObject instanceof String)
				{
					errorMessage = errorObject.toString();
				}

				else if (errorObject instanceof Map)
				{
					ObjectMapper om = new ObjectMapper();
					Map<String, Object> mappedObject = om.convertValue(errorObject,
							new TypeReference<Map<String, Object>>() {});

					if (mappedObject.containsKey("description"))
					{
						errorMessage = mappedObject.get("description").toString();
					}
				}
			}

			throw new UncategorizedApiException("yahoo", errorMessage, null);
		}

		handleUncategorizedError(response);
	}

	private void handleUncategorizedError(ClientHttpResponse response)
	{
		try
		{
			super.handleError(response);
		}
		catch (Exception e)
		{
			throw new UncategorizedApiException("yahoo", "Error consuming Yahoo REST api", e);
		}
	}

	private Map<String, Object> extractErrorDetailsFromResponse(ClientHttpResponse response)
			throws IOException
	{
		ObjectMapper mapper = new ObjectMapper(new JsonFactory());

		try
		{
			return mapper.<Map<String, Object>> readValue(response.getBody(),
					new TypeReference<Map<String, Object>>() {});
		}
		catch (JsonParseException e)
		{
			return Collections.emptyMap();
		}
	}
}
