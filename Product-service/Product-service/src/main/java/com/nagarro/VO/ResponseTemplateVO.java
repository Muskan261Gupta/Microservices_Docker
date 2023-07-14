package com.nagarro.VO;

import com.nagarro.entity.Product;

public class ResponseTemplateVO {
	
	private Product product;
	private ProductDetails productDetails;
	public ResponseTemplateVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResponseTemplateVO(Product product, ProductDetails productDetails) {
		super();
		this.product = product;
		this.productDetails = productDetails;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public ProductDetails getProductDetails() {
		return productDetails;
	}
	public void setProductDetails(ProductDetails productDetails) {
		this.productDetails = productDetails;
	}
	
	
}
