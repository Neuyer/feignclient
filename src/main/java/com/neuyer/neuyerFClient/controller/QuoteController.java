package com.neuyer.neuyerFClient.controller;

import com.neuyer.neuyerFClient.client.QuoteService;
import com.neuyer.neuyerFClient.responses.QuoteResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value =("/quotes"))
public class QuoteController {

    @Autowired
    QuoteService quoteService;

    @GetMapping("/{language}")
    public ResponseEntity<?> getQuote(@PathVariable(name = "language") String language) {
        ResponseEntity<?> finalResponse;
        try {
            QuoteResponse response =  quoteService.getQuote(language);
            finalResponse = new ResponseEntity<>( response, HttpStatus.OK);
        }catch (Exception e) {
            Object body;
            HttpStatus statusCode;
            finalResponse = new ResponseEntity<>(e.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
        }
        return finalResponse;
    }
}
