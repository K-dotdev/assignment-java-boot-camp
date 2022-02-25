package com.javabootcamp.shopping.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public Product productList;

    public String searchProduct(String name) {
        Optional<Product> productList = productRepository.findByProductName(name);
        return productList.get().getProductName();
    }
}
