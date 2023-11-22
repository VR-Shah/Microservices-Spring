package com.ProductService.ProductService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProductService.ProductService.dto.Product;
import com.ProductService.ProductService.exceptionHandler.ResourceNotFoundException;
import com.ProductService.ProductService.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo productRepo;

	@Override
	public Product addProduct(Product product) {
		return productRepo.save(product);
	}

	@Override
	public Product getAllProductById(Long productId) {
		return productRepo.findById(productId)
				.orElseThrow(() -> new ResourceNotFoundException("There is no any Id Found::"));
	}

}
