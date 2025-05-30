package org.codetime.ecommerce2025.repositories;

import org.codetime.ecommerce2025.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository  extends JpaRepository<Payment, Long> {

}
