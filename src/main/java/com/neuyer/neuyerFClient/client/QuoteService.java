package com.neuyer.neuyerFClient.client;

import com.neuyer.neuyerFClient.responses.QuoteResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "QuoteService", url = "${rest_urls.quote}")
public interface QuoteService {
    @RequestMapping
    QuoteResponse getQuote(@RequestParam(value = "language", defaultValue = "en") String language);
}
