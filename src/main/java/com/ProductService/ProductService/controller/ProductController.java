package com.ProductService.ProductService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ProductService.ProductService.dto.Product;
import com.ProductService.ProductService.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping("/addProduct")
	public ResponseEntity<Product> addProduct(@RequestBody Product product) {
		
		try {
			
			return new ResponseEntity<Product>(productService.addProduct(product),HttpStatus.OK);
			
		} catch(Exception e) {
			return new ResponseEntity<Product>(null,null,HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/getProduct")
	public ResponseEntity<Product> getProductById(@PathVariable Long productId) {
		return new ResponseEntity<Product>(productService.getAllProductById(productId), HttpStatus.OK);
	}
	
}
