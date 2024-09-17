package com.project.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.shop.entity.Milk;

@Repository
public interface MilkRepository extends JpaRepository<Milk,Long>{

}
