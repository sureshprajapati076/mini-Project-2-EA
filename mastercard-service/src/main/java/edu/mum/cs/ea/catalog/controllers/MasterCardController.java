package edu.mum.cs.ea.catalog.controllers;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;



@RestController
public class MasterCardController {




    @Autowired
    private UserClient userClient;


    @GetMapping("pay")
    public String getPayment(){
        String result=MasterCardController.class+" "+"I am master transaction  service payment successful  "+ "\n";
        result+= userClient.getPayment();

        return  result;

    }




}
