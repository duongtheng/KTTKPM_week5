package com.example.demo.service;

import com.example.demo.repositories.ProductRepository;
import org.springframework.stereotype.Service;

@Service

public class ProductService {
    private final ProductRepository productRepository;
    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
}
