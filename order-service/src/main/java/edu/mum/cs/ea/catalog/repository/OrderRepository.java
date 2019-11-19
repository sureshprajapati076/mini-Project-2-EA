package edu.mum.cs.ea.catalog.repository;


import edu.mum.cs.ea.catalog.model.Order1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order1, Long> {
}
