package com.dev.ecomercespringboot.service;

import com.dev.ecomercespringboot.model.Product;
import com.dev.ecomercespringboot.repository.ProductRepository;

import java.util.Optional;

public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Optional<Product> findById(Integer id) {
        Optional<Product> product = productRepository.findById(id);
        return product;
    }

    @Override
    public void updateProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);

    }
}
