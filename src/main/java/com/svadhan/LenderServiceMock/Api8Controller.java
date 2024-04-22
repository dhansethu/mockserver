package com.svadhan.LenderServiceMock;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api8Controller {

    @PostMapping("/api/Api8")
    public ResponseEntity<Api8Response> handleApi8Request(@RequestBody Api8Request request) {
        // Process the request and generate a response
        Api8Response response = processApi8Request(request);

        // Return the response along with an appropriate HTTP status code
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    private Api8Response processApi8Request(Api8Request request) {
        // Here, you can perform any processing logic based on the received request
        // For example, you can validate the request, perform business logic, etc.
        // Then, generate a response accordingly
        Api8Response response = new Api8Response();
        // Set response properties based on processing logic
        response.setLoanId("270000100008");
        response.setStatus(1);
        response.setMessage("Repayment Updated.");

        return response;
    }
}
