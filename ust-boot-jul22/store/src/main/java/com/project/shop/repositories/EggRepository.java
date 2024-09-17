package com.project.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.shop.entity.Egg;

@Repository
public interface EggRepository extends JpaRepository<Egg,Long>{

}
