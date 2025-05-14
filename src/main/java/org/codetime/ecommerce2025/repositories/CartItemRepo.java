package org.codetime.ecommerce2025.repositories;

import org.codetime.ecommerce2025.model.CartItem;
import org.codetime.ecommerce2025.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface CartItemRepo extends JpaRepository<CartItem, Long> {

    @Query("SELECT ci.product FROM CartItem  ci WHERE ci.product.productId=?1")
    Product findProductById(Long productId);

    @Query("SELECT ci FROM CartItem ci WHERE ci.cart.cartId =?1 AND ci.product.productId=?2")
    CartItem findCartItemByProductIdAAndCartId(Long cartId, Long productId);

    @Modifying
    @Query("DELETE FROM CartItem ci WHERE ci.cart.cartId = ?1 AND ci.product.productId = ?2")
    void deleteCartItemByProductIdAndCartId(Long productId, Long cartId);
}
