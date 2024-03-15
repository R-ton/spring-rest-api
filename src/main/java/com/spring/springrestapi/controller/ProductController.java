package com.spring.springrestapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.lang.NonNull;
import com.spring.springrestapi.model.Product;
import com.spring.springrestapi.repository.ProductRepository;

@RestController
@RequestMapping("/product")
public class ProductController {

    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @PostMapping(value = "/", consumes = "application/json", produces = "application/json")
    public Product create(@RequestBody @NonNull Product product){
        return this.productRepository.save(product);
    }
}
