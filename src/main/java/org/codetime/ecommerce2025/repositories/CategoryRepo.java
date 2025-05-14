package org.codetime.ecommerce2025.repositories;

import org.codetime.ecommerce2025.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Long> {

    @Query("SELECT c FROM Category c WHERE c.categoryName = ?1")
    Category findCategoryByName(String categoryName);
}
