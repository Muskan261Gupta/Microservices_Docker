package com.nagarro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.nagarro.entity.Admin;
import com.nagarro.entity.Product;
import com.nagarro.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/")
	public Admin saveAdmin(@RequestBody Admin admin) {
		return adminService.saveAdmin(admin);
	}
	
	@GetMapping("/{id}")
	public Admin getAdminById(@PathVariable("id") Long adminId) {
		return adminService.getAdminById(adminId);
	} 
	
	@GetMapping("/alladmins")
	public List<Admin> getAllAdmins(){
		return adminService.getAllAdmins();
	}
	
	@GetMapping("/allproducts")
	public List<Product> getProducts() {	
		List products = this.restTemplate.getForObject("http://PRODUCT-SERVICE/products/allproducts", List.class);
		return products;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteAdminById(@PathVariable("id") Long adminId) {
		return adminService.deleteAdminById(adminId);
	}
}
