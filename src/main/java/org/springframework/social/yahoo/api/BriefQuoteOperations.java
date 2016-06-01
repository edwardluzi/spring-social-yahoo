package org.springframework.social.yahoo.api;

import java.util.Collection;
import java.util.List;

public interface BriefQuoteOperations
{
    List<BriefQuote.Quote> getQuotes(Collection<String> symbols);
}
