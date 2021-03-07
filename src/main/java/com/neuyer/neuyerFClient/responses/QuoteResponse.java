package com.neuyer.neuyerFClient.responses;

import com.neuyer.neuyerFClient.responses.model.Contents;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuoteResponse {
    Contents contents;
}
