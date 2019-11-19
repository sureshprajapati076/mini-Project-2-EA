package edu.mum.cs.ea.catalog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderItem {



    @Id @GeneratedValue(strategy= GenerationType.AUTO)
    private Long itemId;

    private Long orderId;
    private Long quantity;

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    private Long productId;

    public Long getOrderId() {
        return orderId;
    }
    public OrderItem()
    {

    }

    public OrderItem(Long itemId, Long orderId, Long productId,Long quantity) {
        this.itemId = itemId;
        this.orderId = orderId;
        this.productId = productId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}
