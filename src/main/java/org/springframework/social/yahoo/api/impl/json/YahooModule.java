package org.springframework.social.yahoo.api.impl.json;

import org.springframework.social.yahoo.api.Timeseries;
import org.springframework.social.yahoo.api.YahooObject;

import com.fasterxml.jackson.databind.module.SimpleModule;

public class YahooModule extends SimpleModule
{
	private static final long serialVersionUID = 2187084305052393830L;

	public YahooModule()
	{
		super("YahooModule");
	}

	@Override
	public void setupModule(SetupContext context)
	{
		context.setMixInAnnotations(Timeseries.Wrapper.class, TimeseriesMixin.WrapperMixin.class);
		context.setMixInAnnotations(Timeseries.Query.class, TimeseriesMixin.QueryMixin.class);
		context.setMixInAnnotations(Timeseries.Results.class, TimeseriesMixin.ResultsMixin.class);
		context.setMixInAnnotations(Timeseries.Quote.class, TimeseriesMixin.QuoteMixin.class);
		context.setMixInAnnotations(YahooObject.class, YahooObjectMixin.class);
	}
}
