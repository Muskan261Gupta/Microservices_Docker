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

import com.nagarro.VO.ResponseTemplateVO;
import com.nagarro.entity.Product;
import com.nagarro.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@PostMapping("/")
	public Product saveProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}
	
	@GetMapping("/{id}")
	public ResponseTemplateVO getProductWithDetail(@PathVariable("id") Long prodId) {
		return productService.getProductWithDetail(prodId);
	}
	
	@GetMapping("/allproducts")
	public List<Product> getAllDetails(){
		return productService.getAllDetails();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteProductById(@PathVariable("id") Long prodId) {
		return productService.deleteProductById(prodId);
	}
	
}
