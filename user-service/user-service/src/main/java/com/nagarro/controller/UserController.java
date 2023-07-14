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

import com.nagarro.entity.Product;
import com.nagarro.entity.UserDetails;
import com.nagarro.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/")
	public UserDetails saveUser(@RequestBody UserDetails user) {
		return userService.saveUser(user);
	}
	
	@GetMapping("/{id}")
	public UserDetails getUserById(@PathVariable("id") Long userId) {
		return userService.getUserById(userId);
	}
	
	@GetMapping("/allproducts")
	public List<Product> getProducts() {	
		List products = this.restTemplate.getForObject("http://PRODUCT-SERVICE/products/allproducts", List.class);
		return products;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteUserById(@PathVariable("id") Long userId) {
		return userService.deleteUserById(userId);
	}
	
}
