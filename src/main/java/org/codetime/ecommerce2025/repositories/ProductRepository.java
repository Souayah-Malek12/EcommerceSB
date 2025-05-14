package org.codetime.ecommerce2025.repositories;

import org.codetime.ecommerce2025.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long > {
    Page<Product> findByProductNameLike(String keyword, Pageable pageDetails);
}
