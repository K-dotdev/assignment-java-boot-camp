package com.javabootcamp.shopping.product;

public class ProductErrorResponse {

    private String message;
    private int code = 404;

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }


    public String getMessage() {
        return message;
    }

    public ProductErrorResponse(String message) {
        this.message = message;
    }

}
