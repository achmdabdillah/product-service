package com.abdillah.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.abdillah.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
