package com.ProductService.ProductService.service;

import com.ProductService.ProductService.dto.Product;

public interface ProductService {

	Product addProduct(Product product);
	
	Product getAllProductById(Long productId);
	
}
