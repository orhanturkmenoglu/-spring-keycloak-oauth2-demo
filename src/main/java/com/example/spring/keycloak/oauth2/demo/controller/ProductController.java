package com.example.spring.keycloak.oauth2.demo.controller;

import com.example.spring.keycloak.oauth2.demo.model.Product;
import com.example.spring.keycloak.oauth2.demo.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // create products
    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }



    // get all products

    @GetMapping
    public List<Product> getAll() {
        return productService.getProducts();
    }


    // delete product

    @DeleteMapping("/{productId}")
    public void deleteProduct(@PathVariable String productId) {
        productService.deleteProduct(productId);
    }


}
