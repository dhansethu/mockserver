package com.svadhan.LenderServiceMock.model;

import lombok.Data;

@Data
public class Transaction {
    private String date;
    private String transactionType;
    private String narration;
    private int amount;
}
