package com.ust.restjpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.restjpa.entity.Product;
import com.ust.restjpa.services.ProductService;

@RestController
@RequestMapping("/product/api.1.0")
public class ProductController {

	@Autowired
	ProductService service;
	//http://localhost:5000/product/api.1.0/create
	@PostMapping
	@RequestMapping(path="create", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> createProduct(@RequestBody Product productReq){
		Product newP=service.save(productReq);
		return new ResponseEntity<Product>(newP,HttpStatus.CREATED);
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<Product>> getAllProduct(){
		return ResponseEntity.ok().body(service.getAllpro());
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Optional<Product>> getById(@PathVariable Long id){
		return ResponseEntity.ok().body(service.fetchById(id));
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Product> update(@PathVariable Long id,@RequestBody Product updatedproduct){
		return ResponseEntity.ok().body(service.update(updatedproduct));
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Optional<Product>> delete(@PathVariable Long id){
		return ResponseEntity.ok().body(service.delete(id));
	}
}
