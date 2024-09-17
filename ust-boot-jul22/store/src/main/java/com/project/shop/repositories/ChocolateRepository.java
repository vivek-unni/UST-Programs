package com.project.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.shop.entity.Chocolate;

@Repository
public interface ChocolateRepository extends JpaRepository<Chocolate,Long>{

}
