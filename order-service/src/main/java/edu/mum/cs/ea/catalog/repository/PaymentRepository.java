package edu.mum.cs.ea.catalog.repository;


import edu.mum.cs.ea.catalog.model.Payment;
import edu.mum.cs.ea.catalog.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
