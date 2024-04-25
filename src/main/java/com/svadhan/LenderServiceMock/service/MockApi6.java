package com.svadhan.LenderServiceMock.service;

import com.svadhan.LenderServiceMock.model.Api6Response;
import com.svadhan.LenderServiceMock.model.Api6ResponseBody;
import com.svadhan.LenderServiceMock.model.Transaction;
import org.mockserver.client.MockServerClient;
import org.mockserver.model.HttpRequest;
import org.mockserver.model.HttpResponse;
import org.mockserver.model.JsonBody;

public class MockApi6 {
    public Api6Response getMockedResponse() {
        Api6Response response = new Api6Response();
        Api6ResponseBody responseBody = new Api6ResponseBody();
        responseBody.setLoanOs(23000);
        responseBody.setIsDue(false);
        responseBody.setDueAmount(0);
        responseBody.setNextEmiDue(927);
        responseBody.setNextEmiDate("6/1/2023 12:00:00 AM");
        // Assuming last150Transactions is an array of Transaction objects
        Transaction[] transactions = new Transaction[1];
        Transaction transaction = new Transaction();
        transaction.setDate("5/25/2023 3:40:59 PM");
        transaction.setTransactionType("D");
        transaction.setNarration("Amt disbursed");
        transaction.setAmount(23000);
        transactions[0] = transaction;
        responseBody.setLast150Transactions(transactions);
        responseBody.setStatus(1);
        responseBody.setMessage("nill");
        response.setApi6Response(responseBody);
        return response;
    }

    public void mockApi6Response() {
        new MockServerClient("localhost", 8080)
                .when(
                        HttpRequest.request()
                                .withMethod("POST")
                                .withPath("/api/Api6")
                                .withBody(JsonBody.json("{\n" +
                                        "    \"loanId\": \"270000100008\"\n" +
                                        "}"))
                )
                .respond(
                        HttpResponse.response()
                                .withBody(JsonBody.json("{\n" +
                                        "    \"api6Response\": {\n" +
                                        "        \"loanOs\": 23000,\n" +
                                        "        \"isDue\": false,\n" +
                                        "        \"dueAmount\": 0,\n" +
                                        "        \"nextEmiDue\": 927,\n" +
                                        "        \"nextEmiDate\": \"6/1/2023 12:00:00 AM\",\n" +
                                        "        \"last150Transactions\": [\n" +
                                        "            {\n" +
                                        "                \"date\": \"5/25/2023 3:40:59 PM\",\n" +
                                        "                \"transactionType\": \"D\",\n" +
                                        "                \"narration\": \"Amt disbursed\",\n" +
                                        "                \"amount\": 23000\n" +
                                        "            }\n" +
                                        "        ],\n" +
                                        "        \"Status\": 1,\n" +
                                        "        \"Message\": \"nill\"\n" +
                                        "    }\n" +
                                        "}"))
                                .withContentType(org.mockserver.model.MediaType.APPLICATION_JSON)
                );
    }
}
