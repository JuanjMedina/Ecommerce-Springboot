package com.dev.ecomercespringboot.service;

import com.dev.ecomercespringboot.model.Product;

import java.util.Optional;

public interface ProductService {
    // Define the methods that will be implemented in the service class
    Product save(Product product);

    Optional<Product> findById(Integer id);

    void updateProduct(Product product);

    void deleteProduct(Integer id);

}
