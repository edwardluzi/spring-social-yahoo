package org.springframework.social.yahoo.api.impl.json;

import org.springframework.social.yahoo.api.BriefQuote;
import org.springframework.social.yahoo.api.DetailQuote;
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
        context.setMixInAnnotations(BriefQuote.Wrapper.class, BriefQuoteMixin.WrapperMixin.class);
        context.setMixInAnnotations(BriefQuote.Query.class, BriefQuoteMixin.QueryMixin.class);
        context.setMixInAnnotations(BriefQuote.Results.class, BriefQuoteMixin.ResultsMixin.class);
        context.setMixInAnnotations(BriefQuote.Quote.class, BriefQuoteMixin.QuoteMixin.class);

        context.setMixInAnnotations(DetailQuote.Wrapper.class, DetailQuoteMixin.WrapperMixin.class);
        context.setMixInAnnotations(DetailQuote.Query.class, DetailQuoteMixin.QueryMixin.class);
        context.setMixInAnnotations(DetailQuote.Results.class, DetailQuoteMixin.ResultsMixin.class);
        context.setMixInAnnotations(DetailQuote.Quote.class, DetailQuoteMixin.QuoteMixin.class);

        context.setMixInAnnotations(Timeseries.Wrapper.class, TimeseriesMixin.WrapperMixin.class);
        context.setMixInAnnotations(Timeseries.Query.class, TimeseriesMixin.QueryMixin.class);
        context.setMixInAnnotations(Timeseries.Results.class, TimeseriesMixin.ResultsMixin.class);
        context.setMixInAnnotations(Timeseries.Quote.class, TimeseriesMixin.QuoteMixin.class);

        context.setMixInAnnotations(YahooObject.class, YahooObjectMixin.class);
    }
}
