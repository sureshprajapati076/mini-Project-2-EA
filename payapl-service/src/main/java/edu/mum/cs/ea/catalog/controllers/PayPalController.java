package edu.mum.cs.ea.catalog.controllers;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;



@RestController
public class PayPalController {




    @Autowired
    private UserClient userClient;


    @GetMapping("pay")
    public String getPayment(){
        String result= PayPalController.class+" "+"I am paypal transaction  service payment successful  "+ "\n";
        result+= userClient.getPayment();

        return  result;

    }




}
