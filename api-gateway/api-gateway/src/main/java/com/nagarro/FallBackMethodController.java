package com.nagarro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

	@GetMapping("/productServiceFallback")
	public String productServiceFallbackMethod() {
		return "Product Service is taking longer than expected!! Please Try Again!!";
		}
	
	@GetMapping("/detailServiceFallback")
	public String detailServiceFallbackMethod() {
		return "Details Service is taking longer than expected!! Please Try Again!!";
		}
	
	@GetMapping("/userServiceFallback")
	public String userServiceFallbackMethod() {
		return "User Service is taking longer than expected!! Please Try Again!!";
		}
	
	@GetMapping("/adminServiceFallback")
	public String adminServiceFallbackMethod() {
		return "Admin Service is taking longer than expected!! Please Try Again!!";
		}
}
