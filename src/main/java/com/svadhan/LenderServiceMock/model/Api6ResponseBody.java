package com.svadhan.LenderServiceMock.model;

import com.fasterxml.jackson.annotation.JsonProperty; // Import JSON property annotation
import lombok.Data;

@Data
public class Api6ResponseBody {
    @JsonProperty("loanOs")
    private int loanOs;
    @JsonProperty("due")
    private boolean isDue;
    @JsonProperty("dueAmount")
    private int dueAmount;
    @JsonProperty("nextEmiDue")
    private int nextEmiDue;
    @JsonProperty("nextEmiDate")
    private String nextEmiDate;
    @JsonProperty("last150Transactions")
    private Transaction[] last150Transactions;
    @JsonProperty("Status")
    private int Status;
    @JsonProperty("Message")
    private String Message;

    public void setIsDue(boolean b) {
    }
}
