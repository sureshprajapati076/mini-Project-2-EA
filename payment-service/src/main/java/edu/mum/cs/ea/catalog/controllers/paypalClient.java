package edu.mum.cs.ea.catalog.controllers;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// import feign.RequestLine;

@FeignClient(name = "paypal-service")
public interface paypalClient {

    @RequestMapping(method = RequestMethod.GET, value = "pay", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    String getPayment();


}


