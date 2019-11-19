package edu.mum.cs.ea.catalog.controllers;

import edu.mum.cs.ea.catalog.model.OrderItem;
import edu.mum.cs.ea.catalog.model.Payment;

import java.util.List;

public class RequestWrapper {
    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    List<OrderItem> items;
    Payment payment;
}
