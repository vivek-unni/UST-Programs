package com.project.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.shop.entity.Apple;

@Repository
public interface AppleRepository extends JpaRepository<Apple,Long>{

}
