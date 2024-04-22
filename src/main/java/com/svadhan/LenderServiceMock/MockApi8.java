package com.svadhan.LenderServiceMock;

import org.mockserver.client.MockServerClient;
import org.mockserver.model.HttpRequest;
import org.mockserver.model.HttpResponse;
import org.mockserver.model.JsonBody;

public class MockApi8 {
    public void mockApi8Response() {
        new MockServerClient("localhost", 8080)
                .when(
                        HttpRequest.request()
                                .withMethod("POST")
                                .withPath("/api/Api8")
                                .withBody(JsonBody.json("{\n" +
                                        "    \"loanId\": \"270000100013\",\n" +
                                        "    \"amount\": 1000.00,\n" +
                                        "    \"repaymentMadeThrough\": \"CUSTOMER_APP\",\n" +
                                        "    \"transactionDate\": \"2023-05-26\",\n" +
                                        "    \"transactionReferenceNo\": 346656776989\n" +
                                        "}"))
                )
                .respond(
                        HttpResponse.response()
                                .withBody(JsonBody.json("{\n" +
                                        "    \"api8Response\": {\n" +
                                        "        \"loanId\": \"270000100008\",\n" +
                                        "        \"status\": 1,\n" +
                                        "        \"message\": \"Repayment Updated.\"\n" +
                                        "    }\n" +
                                        "}"))
                                .withContentType(org.mockserver.model.MediaType.APPLICATION_JSON)
                );
    }
}
