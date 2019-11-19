package edu.mum.cs.ea.catalog.controllers;


import edu.mum.cs.ea.catalog.model.Product;
import edu.mum.cs.ea.catalog.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/{productId}")
    public Product getProduct(@PathVariable("productId") Long productId){
        System.getenv();

        return productService.getProduct(productId);
    }

    @GetMapping("/getProducts")
    public List<Product> getProducts(){

        return productService.getProducts();
    }
    @GetMapping("/all/{accountType}")
    public String good(@PathVariable("accountType") String accountType){

        return accountType+"merciiii";
    }

}
