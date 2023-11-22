package com.ProductService.ProductService.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProductService.ProductService.dto.Product;

public interface ProductRepo extends JpaRepository<Product, Long>{

}
