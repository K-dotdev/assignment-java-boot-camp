package com.javabootcamp.shopping.product;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product{
	private int priceValidUntil;
	private String priceCurrency;
	private double reviewRate;
	private String productImage;
	@Id
	private int productId;
	private String productDetail;
	private int lowPrice;
	private int reviewCount;
	private int highPrice;
	private int viewCount;
	private int provinceId;
	private String productName;

	public int getPriceValidUntil(){
		return priceValidUntil;
	}

	public String getPriceCurrency(){
		return priceCurrency;
	}

	public double getReviewRate(){
		return reviewRate;
	}

	public String getProductImage(){
		return productImage;
	}

	public int getProductId(){
		return productId;
	}

	public String getProductDetail(){
		return productDetail;
	}

	public int getLowPrice(){
		return lowPrice;
	}

	public int getReviewCount(){
		return reviewCount;
	}

	public int getHighPrice(){
		return highPrice;
	}

	public int getViewCount(){
		return viewCount;
	}

	public int getProvinceId(){
		return provinceId;
	}

	public String getProductName(){
		return productName;
	}

	public void setPriceValidUntil(int priceValidUntil) {
		this.priceValidUntil = priceValidUntil;
	}

	public void setPriceCurrency(String priceCurrency) {
		this.priceCurrency = priceCurrency;
	}

	public void setReviewRate(double reviewRate) {
		this.reviewRate = reviewRate;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public void setProductDetail(String productDetail) {
		this.productDetail = productDetail;
	}

	public void setLowPrice(int lowPrice) {
		this.lowPrice = lowPrice;
	}

	public void setReviewCount(int reviewCount) {
		this.reviewCount = reviewCount;
	}

	public void setHighPrice(int highPrice) {
		this.highPrice = highPrice;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
}
