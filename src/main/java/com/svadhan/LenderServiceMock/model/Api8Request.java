package com.svadhan.LenderServiceMock.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Api8Request {
    @JsonProperty("loanId")
    private String loanId;

    @JsonProperty("amount")
    private double amount;

    @JsonProperty("repaymentMadeThrough")
    private String repaymentMadeThrough;

    @JsonProperty("transactionDate")
    private String transactionDate;

    @JsonProperty("transactionReferenceNo")
    private long transactionReferenceNo;
}
