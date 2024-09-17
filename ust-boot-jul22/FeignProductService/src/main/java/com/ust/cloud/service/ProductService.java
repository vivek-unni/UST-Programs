package com.ust.cloud.service;

import java.util.List;

import com.ust.cloud.model.Product;

public interface ProductService {

	List<Product> findAll();
	List<Product> findByCategory(String category);
	Product findById(int id);
}
