package com.shopline.ecommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
    
    @Id
    // Removed GenerationType.IDENTITY because your SQL provides IDs manually (2001, 2002, etc.)
    private Long id;
    
    private String name;
    
    // This was missing in your variables but present in your getters!
    private String category;
    
    private double price;
    
    @Column(name = "image_url")
    private String imageUrl;

    // Default Constructor
    public Product() {}

    // Getters
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; } // Matches the variable above
    public double getPrice() { return price; }
    public String getImageUrl() { return imageUrl; }

    // Setters
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setCategory(String category) { this.category = category; }
    public void setPrice(double price) { this.price = price; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
}