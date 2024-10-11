package com.example.spring.keycloak.oauth2.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    private String productId;
    private String name;
    private String description;
    private double price;

    // Getters and setters

}
