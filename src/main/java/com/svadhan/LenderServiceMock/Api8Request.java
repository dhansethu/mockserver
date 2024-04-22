package com.svadhan.LenderServiceMock;

import lombok.Data;

@Data
public class Api8Request {
    private String loanId;
    private double amount;
    private String repaymentMadeThrough;
    private String transactionDate;
    private long transactionReferenceNo;
}
