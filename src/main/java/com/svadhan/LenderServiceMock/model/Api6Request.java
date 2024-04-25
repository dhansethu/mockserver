package com.svadhan.LenderServiceMock.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
    @Data
    public class Api6Request {
        @JsonProperty("loanId")
        private String loanId;
    }


