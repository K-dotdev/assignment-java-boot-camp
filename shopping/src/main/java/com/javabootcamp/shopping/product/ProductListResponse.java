package com.javabootcamp.shopping.product;

public class ProductListResponse{


	private String searchName;
	private int status;
	private String message;

	public ProductListResponse(String searchName) {
		this.searchName = searchName;
	}

	public String getSearchName() {
		return searchName;
	}

	public void setSearchName(String searchName) {
		this.searchName = searchName;
	}

	public String getMessage(){
		return message;
	}

	public int getStatus(){
		return status;
	}

}
