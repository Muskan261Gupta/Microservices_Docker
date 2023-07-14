package com.nagarro.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class UserDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userId;
	private String name;
	private String email;
//	List<Product> products=new ArrayList<>();
	
	
	public UserDetails() {
		super();
	}


	

//	public UserDetails(Long userId, String name, String email, List<Product> products) {
//		super();
//		this.userId = userId;
//		this.name = name;
//		this.email = email;
//		this.products = products;
//	}





	public UserDetails(Long userId, String name, String email) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
	}


	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
