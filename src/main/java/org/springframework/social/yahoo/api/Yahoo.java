package org.springframework.social.yahoo.api;

import org.springframework.social.ApiBinding;
import org.springframework.web.client.RestOperations;

public interface Yahoo  extends ApiBinding
{
	TimeseriesOperations timeseriesOperations();
	
	RestOperations restOperations();
}
