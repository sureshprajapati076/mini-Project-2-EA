package edu.mum.cs.ea.catalog.controllers;

import edu.mum.cs.ea.catalog.model.Order1;
import edu.mum.cs.ea.catalog.model.OrderItem;
import edu.mum.cs.ea.catalog.model.Payment;
import edu.mum.cs.ea.catalog.model.Product;
import edu.mum.cs.ea.catalog.repository.OrderItemRepository;
import edu.mum.cs.ea.catalog.repository.OrderRepository;
import edu.mum.cs.ea.catalog.repository.PaymentRepository;
import edu.mum.cs.ea.catalog.repository.ProductRepository;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import javax.xml.bind.DatatypeConverter;


@RestController
public class OrderController {

    @Autowired
    OrderItemRepository orderItemRepository;

    @Autowired
    PaymentRepository paymentRepository;

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    ProductRepository productRepository;



    @Autowired
    private UserClient userClient;



    @RequestMapping(value = "/createOrder", method = RequestMethod.POST)
    public String updateWithMultipleObjects(
            @RequestBody RequestWrapper requestWrapper,    @RequestHeader (name="Authorization") String token) {
      Claims c = decodeJWT(token.replace("Bearer",""));
String chain="";

boolean validOrder = true;
        for(int i=0 ; i<requestWrapper.getItems().size();i++)
        {
            OrderItem orderItem = requestWrapper.getItems().get(i);
if(productRepository.findOne(orderItem.getProductId()).getQuantity()< orderItem.getQuantity())
{
    validOrder = false;
    chain = "Invalid Order we can't go to further";
    break;
} }

        if(validOrder)
        {
            for(int i=0 ; i<requestWrapper.getItems().size();i++)
            {
                OrderItem orderItem = requestWrapper.getItems().get(i);
                Product editProduct = productRepository.findOne(orderItem.getProductId());
                editProduct.setQuantity((int) (editProduct.getQuantity()-orderItem.getQuantity()));
                productRepository.save(editProduct);
                orderItem.setOrderId(orderRepository.count()+1);
                orderItemRepository.save(orderItem);

            }

Order1 finalOrder = new Order1(c.getSubject());
            orderRepository.save(finalOrder);

            requestWrapper.payment.setUser_id(c.getSubject());
            Payment payment =  requestWrapper.payment;

            paymentRepository.save(payment);
            //Discover Payment with the payment Type
            chain = OrderController.class+" "+"I am order service i will send payment type to Payment"+ "\n";

            chain+=userClient.getPayment(payment.getType());


        }
return chain;

    }


    public static Claims decodeJWT(String jwt) {
        Claims claims = Jwts.parser()
                .setSigningKey(DatatypeConverter.parseBase64Binary("MY-Secret-Key"))
                .parseClaimsJws(jwt).getBody();
        return claims;
    }





}
