package com.example.spring.keycloak.oauth2.demo.service;


import com.example.spring.keycloak.oauth2.demo.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();

    public ProductService() {
        products.add(Product.builder()
                .productId(UUID.randomUUID().toString())
                .name("Product 1")
                .description("Product 1 description")
                .price(100.0)
                .build());
    }

    // create
    public Product addProduct(Product product) {
       product.setProductId(UUID.randomUUID().toString());
       products.add(product);

       return product;
    }

    // get all products

    public List<Product> getProducts() {
        return products;
    }

    // delete product

    public void deleteProduct(String productId) {
        products.removeIf(product -> product.getProductId().equals(productId));
    }

    // update product
}
