package com.project.shop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.shop.entity.Apple;
import com.project.shop.entity.Bread;
import com.project.shop.entity.Chocolate;
import com.project.shop.entity.Egg;
import com.project.shop.entity.Milk;
import com.project.shop.repositories.AppleRepository;
import com.project.shop.repositories.BreadRepository;
import com.project.shop.repositories.ChocolateRepository;
import com.project.shop.repositories.EggRepository;
import com.project.shop.repositories.MilkRepository;


@Service
public class ProductService {
	
	@Autowired
	AppleRepository applerepository;
	
	public Apple saveApple(Apple apple) {
		return applerepository.save(apple);
	}
	
	public List<Apple> getAllApple() {
		return applerepository.findAll();
	}
	
	public Optional<Apple> fetchByIdApple(long id) {
		java.util.Optional<Apple> apple=applerepository.findById(id);
		if(apple.isPresent()) {
			return apple;
		}else {
			return null;
		}
	}
	
	public Apple updateApple(Apple newapple) {
		long id=newapple.getProduct_id();
		Optional<Apple> apple=applerepository.findById(id);
		if(apple.isPresent()) {
			return applerepository.save(newapple);
		}else {
			return null;
		}
	}
	
	public Optional<Apple> deleteApple( long id) {
		
		Optional<Apple> apple=applerepository.findById(id);
		if(apple.isPresent()) {
			applerepository.deleteById(id);
			return apple;
		}else {
			return null;
		}
	}
	
	@Autowired
	BreadRepository breadRepository;

	public Bread saveBread(Bread bread) {
	    return breadRepository.save(bread);
	}

	public List<Bread> getAllBread() {
	    return breadRepository.findAll();
	}

	public Optional<Bread> fetchByIdBread(long id) {
	    return breadRepository.findById(id);
	}

	public Bread updateBread(Bread newBread) {
	    long id = newBread.getProduct_id();
	    Optional<Bread> bread = breadRepository.findById(id);
	    if (bread.isPresent()) {
	        return breadRepository.save(newBread);
	    } else {
	        return null;
	    }
	}

	public Optional<Bread> deleteBread(long id) {
	    Optional<Bread> bread = breadRepository.findById(id);
	    if (bread.isPresent()) {
	        breadRepository.deleteById(id);
	        return bread;
	    } else {
	        return null;
	    }
	}
	
	@Autowired
	MilkRepository milkRepository;

	public Milk saveMilk(Milk milk) {
	    return milkRepository.save(milk);
	}

	public List<Milk> getAllMilk() {
	    return milkRepository.findAll();
	}

	public Optional<Milk> fetchByIdMilk(long id) {
	    return milkRepository.findById(id);
	}

	public Milk updateMilk(Milk newMilk) {
	    long id = newMilk.getProduct_id();
	    Optional<Milk> milk = milkRepository.findById(id);
	    if (milk.isPresent()) {
	        return milkRepository.save(newMilk);
	    } else {
	        return null;
	    }
	}

	public Optional<Milk> deleteMilk(long id) {
	    Optional<Milk> milk = milkRepository.findById(id);
	    if (milk.isPresent()) {
	        milkRepository.deleteById(id);
	        return milk;
	    } else {
	        return null;
	    }
	}

	@Autowired
	EggRepository eggRepository;

	public Egg saveEgg(Egg egg) {
	    return eggRepository.save(egg);
	}

	public List<Egg> getAllEgg() {
	    return eggRepository.findAll();
	}

	public Optional<Egg> fetchByIdEgg(long id) {
	    return eggRepository.findById(id);
	}

	public Egg updateEgg(Egg newEgg) {
	    long id = newEgg.getProduct_id();
	    Optional<Egg> egg = eggRepository.findById(id);
	    if (egg.isPresent()) {
	        return eggRepository.save(newEgg);
	    } else {
	        return null;
	    }
	}

	public Optional<Egg> deleteEgg(long id) {
	    Optional<Egg> egg = eggRepository.findById(id);
	    if (egg.isPresent()) {
	        eggRepository.deleteById(id);
	        return egg;
	    } else {
	        return null;
	    }
	}


	@Autowired
	ChocolateRepository chocolateRepository;

	public Chocolate saveChocolate(Chocolate chocolate) {
	    return chocolateRepository.save(chocolate);
	}

	public List<Chocolate> getAllChocolate() {
	    return chocolateRepository.findAll();
	}

	public Optional<Chocolate> fetchByIdChocolate(long id) {
	    return chocolateRepository.findById(id);
	}

	public Chocolate updateChocolate(Chocolate newChocolate) {
	    long id = newChocolate.getProduct_id();
	    Optional<Chocolate> chocolate = chocolateRepository.findById(id);
	    if (chocolate.isPresent()) {
	        return chocolateRepository.save(newChocolate);
	    } else {
	        return null;
	    }
	}

	public Optional<Chocolate> deleteChocolate(long id) {
	    Optional<Chocolate> chocolate = chocolateRepository.findById(id);
	    if (chocolate.isPresent()) {
	        chocolateRepository.deleteById(id);
	        return chocolate;
	    } else {
	        return null;
	    }
	}


}
