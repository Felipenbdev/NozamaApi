package com.nozama.Nozama.repository;

import com.nozama.Nozama.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
