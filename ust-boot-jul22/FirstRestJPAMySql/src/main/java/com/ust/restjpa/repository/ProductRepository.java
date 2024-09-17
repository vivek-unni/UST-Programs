package com.ust.restjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.restjpa.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{

}
