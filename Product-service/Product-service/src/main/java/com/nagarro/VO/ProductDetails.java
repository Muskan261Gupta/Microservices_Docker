package com.nagarro.VO;


public class ProductDetails {

	private long detailId;
	private String size;
	private String price;
	private String design;
	public ProductDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductDetails(long detailId, String size, String price, String design) {
		super();
		this.detailId = detailId;
		this.size = size;
		this.price = price;
		this.design = design;
	}
	public long getDetailId() {
		return detailId;
	}
	public void setDetailId(long detailId) {
		this.detailId = detailId;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	
	
}
