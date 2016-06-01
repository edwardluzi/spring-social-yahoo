package org.springframework.social.yahoo.api;

import java.util.Collection;
import java.util.List;

public interface DetailQuoteOperations
{
    List<DetailQuote.Quote> getQuotes(Collection<String> symbols);
}
