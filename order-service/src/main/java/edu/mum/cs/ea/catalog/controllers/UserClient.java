package edu.mum.cs.ea.catalog.controllers;

import edu.mum.cs.ea.catalog.model.Product;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

// import feign.RequestLine;

@FeignClient(name = "payment-service")
public interface UserClient {
    // @RequestLine("GET /hi_getall")
    // List<String> getGreetings();

    @RequestMapping(method = RequestMethod.GET, value = "pay/{payment}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    String getPayment(@PathVariable("payment") String payment);

}


