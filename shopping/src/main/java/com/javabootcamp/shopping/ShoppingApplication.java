package com.javabootcamp.shopping;

import com.javabootcamp.shopping.product.Product;
import com.javabootcamp.shopping.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class ShoppingApplication {
	@Autowired
	private ProductRepository productRepository;
	@PostConstruct
	private void initialProductData() {
		Product product = new Product();
		product.setProductName("product1");
		productRepository.save(product);
	}

	public static void main(String[] args) {
		SpringApplication.run(ShoppingApplication.class, args);
	}

}
