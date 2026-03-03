package com.shopline.ecommerce.repository;

import com.shopline.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List; // Idhai import panna marandhidatheenga!

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    
    // IDHU DHAAN MISSING: 
    // Indha line dhaan frontend-la neenga category click pannumbodhu 
    // database-la irundhu filter panni eduthu tharum.
    List<Product> findByCategory(String category);
}