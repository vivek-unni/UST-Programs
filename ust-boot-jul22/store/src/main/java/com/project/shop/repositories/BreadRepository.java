package com.project.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.shop.entity.Bread;

@Repository
public interface BreadRepository extends JpaRepository<Bread,Long>{

}
