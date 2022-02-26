package com.javabootcamp.shopping.product;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public Product productList;

    @SneakyThrows
    public String searchProduct(String name) {
        Optional<Product> productList = productRepository.findByProductName(name);
        if(productList.isPresent()) {
            return productList.get().getProductName();
        }
        throw new ProductNotFoundException();
    }
}
