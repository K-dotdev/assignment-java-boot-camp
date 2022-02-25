package com.javabootcamp.shopping.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/product/{searchName}")
    public ProductListResponse getProductList(@PathVariable String searchName) {
        return new ProductListResponse(productService.searchProduct(searchName));
    }
}
