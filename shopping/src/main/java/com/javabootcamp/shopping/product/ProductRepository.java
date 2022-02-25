package com.javabootcamp.shopping.product;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    public Optional<Product> findByProductName(String name);
}
