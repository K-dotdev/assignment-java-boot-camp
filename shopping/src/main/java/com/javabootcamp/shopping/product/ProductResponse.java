package com.javabootcamp.shopping.product;

public class ProductResponse {

    private String message;

    public ProductResponse(String searchName) {
        this.message = searchName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
