package edu.mum.cs.ea.catalog.repository;


import edu.mum.cs.ea.catalog.model.OrderItem;
import edu.mum.cs.ea.catalog.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
