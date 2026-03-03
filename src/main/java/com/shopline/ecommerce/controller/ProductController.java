package com.shopline.ecommerce.controller;

import com.shopline.ecommerce.model.Product;
import com.shopline.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/products") 
public class ProductController {

    @Autowired
    private ProductRepository repository; 

    // ALL PRODUCTS & CATEGORY FILTER (Combined logic)
    // URL: /api/products?category=All OR /api/products?category=Mobiles
    @GetMapping
    public List<Product> getProducts(@RequestParam(required = false) String category) {
        // Category kudukalanaal-o illa 'All' nu vandhaalo ellathaeyum kaattu
        if (category == null || category.equalsIgnoreCase("All") || category.isEmpty()) {
            return repository.findAll(); 
        }
        // Specific category filter
        return repository.findByCategory(category); 
    }

    // Product Add panna
    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return repository.save(product);
    }

    // Product Delete panna
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        repository.deleteById(id);
    }
}