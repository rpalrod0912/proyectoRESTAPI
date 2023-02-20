package com.example.proyectorestapi.repository;

import com.example.proyectorestapi.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product,String> {
    List<Product> findByPrecio(int precio);

    @Query("{nombre:  ?0 }")
    List<Product> findByNombre(String nombre);
}
