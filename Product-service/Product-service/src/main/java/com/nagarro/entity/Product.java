package com.nagarro.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long prodId;
	private String prodName;
	private String prodAvailability;
	private Long detailId;
	
	public Product() {
		super();
	}

	public Product(Long prodId, String prodName, String prodAvailability, Long detailId) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodAvailability = prodAvailability;
		this.detailId = detailId;
	}

	public Long getProdId() {
		return prodId;
	}

	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdAvailability() {
		return prodAvailability;
	}

	public void setProdAvailability(String prodAvailability) {
		this.prodAvailability = prodAvailability;
	}

	public Long getDetailId() {
		return detailId;
	}

	public void setDetailId(Long detailId) {
		this.detailId = detailId;
	}
	

}
