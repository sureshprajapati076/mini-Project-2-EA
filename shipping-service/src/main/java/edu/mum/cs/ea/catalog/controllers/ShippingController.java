package edu.mum.cs.ea.catalog.controllers;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;



@RestController
public class ShippingController {






    @GetMapping("pay")
    public String getPayment (){

        String result=ShippingController.class+" "+"I am Shipping department and the item will be shipped "+ "\n";


        return  result;

    }




}
