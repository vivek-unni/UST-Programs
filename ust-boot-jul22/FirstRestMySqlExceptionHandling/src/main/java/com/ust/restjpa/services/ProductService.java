package com.ust.restjpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.restjpa.entity.Product;
import com.ust.restjpa.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository repository;
	
	public Product save(Product product) {
		return repository.save(product);
	}
	
	public List<Product> getAllpro() {
		return repository.findAll();
	}
	
	public Optional<Product> fetchById(long id) {
		java.util.Optional<Product> product=repository.findById(id);
		if(product.isPresent()) {
			return product;
		}else {
			return null;
		}
	}
	
	public Product update(Product newprod) {
		long id=newprod.getProduct_id();
		Optional<Product> prod=repository.findById(id);
		if(prod.isPresent()) {
			return repository.save(newprod);
		}else {
			return null;
		}
	}
	
	public Optional<Product> delete( long id) {
		
		Optional<Product> prod=repository.findById(id);
		if(prod.isPresent()) {
			repository.deleteById(id);
			return prod;
		}else {
			return null;
		}
	}

}
