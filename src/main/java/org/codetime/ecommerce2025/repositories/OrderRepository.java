package org.codetime.ecommerce2025.repositories;

import jakarta.validation.constraints.AssertFalse;
import org.codetime.ecommerce2025.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {

    @Query("SELECT o FROM Order o WHERE o.email = ?1 AND o.orderId = ?2")
    Order findOrderByEmailAndOrderId(String email, Long cartId);

   List<Order> findOrderByEmail(String email);
}
