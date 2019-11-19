package edu.mum.cs.ea.catalog.controllers;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;



@RestController
public class PaymentController {

    @Autowired
    private paypalClient paypalClient;


    @Autowired
    private MasterClient masterClient;


    @GetMapping("pay/{payment}")
    public String getPayment(@PathVariable("payment") String payment){

        String result=PaymentController.class+" "+"I am Payment service i will send payment type to Transaction "+payment+ "\n";
        String key = System.getenv(payment);
        if(System.getenv(key).equals("paypal-service"))
        {
           result+=paypalClient.getPayment();
        }
        else
        {
            result+=masterClient.getPayment();
        }

        return  result;

    }




}
