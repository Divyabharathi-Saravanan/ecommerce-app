package com.shopline.ecommerce.controller;

import com.shopline.ecommerce.model.CartItem;
import com.shopline.ecommerce.model.Product;
import com.shopline.ecommerce.repository.CartRepository;
import com.shopline.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<CartItem> getCartItems() {
        return cartRepository.findAll();
    }

    @PostMapping("/add/{productId}")
    public CartItem addToCart(@PathVariable Long productId) {
        Product product = productRepository.findById(productId).get();
        CartItem item = new CartItem();
        item.setProduct(product);
        item.setQuantity(1);
        return cartRepository.save(item);
    }
}