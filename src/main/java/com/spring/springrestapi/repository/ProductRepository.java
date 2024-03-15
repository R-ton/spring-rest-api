package com.spring.springrestapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.spring.springrestapi.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

}
