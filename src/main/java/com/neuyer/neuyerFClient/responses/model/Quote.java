package com.neuyer.neuyerFClient.responses.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Quote {
    String author;
    String quote;
    List<String> tags;
    String id;
    String image;
    Integer length;
    Date date;
}
