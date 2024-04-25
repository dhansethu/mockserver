package com.svadhan.LenderServiceMock.route;

import com.svadhan.LenderServiceMock.model.Api6Request;
import com.svadhan.LenderServiceMock.model.Api6Response;
import com.svadhan.LenderServiceMock.service.MockApi6;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api6Controller {

    @PostMapping("/api/Api6")
    public ResponseEntity<Api6Response> handleApi6Request(@RequestBody Api6Request request) {
        // Assuming the request is used for processing,
        // here we're just mocking the response
        MockApi6 mockApi6 = new MockApi6();
        Api6Response response = mockApi6.getMockedResponse();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
