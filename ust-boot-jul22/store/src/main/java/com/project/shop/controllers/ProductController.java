package com.project.shop.controllers;

import com.project.shop.entity.*;
import com.project.shop.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    // Apples
    @PostMapping("/apples")
    public ResponseEntity<Apple> saveApple(@RequestBody Apple apple) {
        Apple savedApple = productService.saveApple(apple);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedApple);
    }

    @GetMapping("/apples")
    public ResponseEntity<List<Apple>> getAllApples() {
        List<Apple> apples = productService.getAllApple();
        return ResponseEntity.ok().body(apples);
    }

    @GetMapping("/apples/{id}")
    public ResponseEntity<Optional<Apple>> getAppleById(@PathVariable("id") long id) {
        Optional<Apple> apple = productService.fetchByIdApple(id);
        if (apple != null) {
            return ResponseEntity.ok().body(apple);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/apples/{id}")
    public ResponseEntity<Apple> updateApple(@PathVariable("id") long id, @RequestBody Apple newApple) {
        newApple.setProduct_id(id); // Ensure the ID in the path matches the ID in the body
        Apple updatedApple = productService.updateApple(newApple);
        if (updatedApple != null) {
            return ResponseEntity.ok().body(updatedApple);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/apples/{id}")
    public ResponseEntity<Optional<Apple>> deleteApple(@PathVariable("id") long id) {
        Optional<Apple> deletedApple = productService.deleteApple(id);
        if (deletedApple != null) {
            return ResponseEntity.ok().body(deletedApple);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Bread
    @PostMapping("/breads")
    public ResponseEntity<Bread> saveBread(@RequestBody Bread bread) {
        Bread savedBread = productService.saveBread(bread);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedBread);
    }

    @GetMapping("/breads")
    public ResponseEntity<List<Bread>> getAllBreads() {
        List<Bread> breads = productService.getAllBread();
        return ResponseEntity.ok().body(breads);
    }

    @GetMapping("/breads/{id}")
    public ResponseEntity<Optional<Bread>> getBreadById(@PathVariable("id") long id) {
        Optional<Bread> bread = productService.fetchByIdBread(id);
        if (bread != null) {
            return ResponseEntity.ok().body(bread);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/breads/{id}")
    public ResponseEntity<Bread> updateBread(@PathVariable("id") long id, @RequestBody Bread newBread) {
        newBread.setProduct_id(id); // Ensure the ID in the path matches the ID in the body
        Bread updatedBread = productService.updateBread(newBread);
        if (updatedBread != null) {
            return ResponseEntity.ok().body(updatedBread);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/breads/{id}")
    public ResponseEntity<Optional<Bread>> deleteBread(@PathVariable("id") long id) {
        Optional<Bread> deletedBread = productService.deleteBread(id);
        if (deletedBread != null) {
            return ResponseEntity.ok().body(deletedBread);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Milk
    @PostMapping("/milks")
    public ResponseEntity<Milk> saveMilk(@RequestBody Milk milk) {
        Milk savedMilk = productService.saveMilk(milk);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedMilk);
    }

    @GetMapping("/milks")
    public ResponseEntity<List<Milk>> getAllMilks() {
        List<Milk> milks = productService.getAllMilk();
        return ResponseEntity.ok().body(milks);
    }

    @GetMapping("/milks/{id}")
    public ResponseEntity<Optional<Milk>> getMilkById(@PathVariable("id") long id) {
        Optional<Milk> milk = productService.fetchByIdMilk(id);
        if (milk != null) {
            return ResponseEntity.ok().body(milk);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/milks/{id}")
    public ResponseEntity<Milk> updateMilk(@PathVariable("id") long id, @RequestBody Milk newMilk) {
        newMilk.setProduct_id(id); // Ensure the ID in the path matches the ID in the body
        Milk updatedMilk = productService.updateMilk(newMilk);
        if (updatedMilk != null) {
            return ResponseEntity.ok().body(updatedMilk);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/milks/{id}")
    public ResponseEntity<Optional<Milk>> deleteMilk(@PathVariable("id") long id) {
        Optional<Milk> deletedMilk = productService.deleteMilk(id);
        if (deletedMilk != null) {
            return ResponseEntity.ok().body(deletedMilk);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Egg
    @PostMapping("/eggs")
    public ResponseEntity<Egg> saveEgg(@RequestBody Egg egg) {
        Egg savedEgg = productService.saveEgg(egg);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedEgg);
    }

    @GetMapping("/eggs")
    public ResponseEntity<List<Egg>> getAllEggs() {
        List<Egg> eggs = productService.getAllEgg();
        return ResponseEntity.ok().body(eggs);
    }

    @GetMapping("/eggs/{id}")
    public ResponseEntity<Optional<Egg>> getEggById(@PathVariable("id") long id) {
        Optional<Egg> egg = productService.fetchByIdEgg(id);
        if (egg != null) {
            return ResponseEntity.ok().body(egg);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/eggs/{id}")
    public ResponseEntity<Egg> updateEgg(@PathVariable("id") long id, @RequestBody Egg newEgg) {
        newEgg.setProduct_id(id); // Ensure the ID in the path matches the ID in the body
        Egg updatedEgg = productService.updateEgg(newEgg);
        if (updatedEgg != null) {
            return ResponseEntity.ok().body(updatedEgg);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/eggs/{id}")
    public ResponseEntity<Optional<Egg>> deleteEgg(@PathVariable("id") long id) {
        Optional<Egg> deletedEgg = productService.deleteEgg(id);
        if (deletedEgg != null) {
            return ResponseEntity.ok().body(deletedEgg);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Chocolate
    @PostMapping("/chocolates")
    public ResponseEntity<Chocolate> saveChocolate(@RequestBody Chocolate chocolate) {
        Chocolate savedChocolate = productService.saveChocolate(chocolate);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedChocolate);
    }

    @GetMapping("/chocolates")
    public ResponseEntity<List<Chocolate>> getAllChocolates() {
        List<Chocolate> chocolates = productService.getAllChocolate();
        return ResponseEntity.ok().body(chocolates);
    }

    @GetMapping("/chocolates/{id}")
    public ResponseEntity<Optional<Chocolate>> getChocolateById(@PathVariable("id") long id) {
        Optional<Chocolate> chocolate = productService.fetchByIdChocolate(id);
        if (chocolate != null) {
            return ResponseEntity.ok().body(chocolate);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/chocolates/{id}")
    public ResponseEntity<Chocolate> updateChocolate(@PathVariable("id") long id, @RequestBody Chocolate newChocolate) {
        newChocolate.setProduct_id(id); // Ensure the ID in the path matches the ID in the body
        Chocolate updatedChocolate = productService.updateChocolate(newChocolate);
        if (updatedChocolate != null) {
            return ResponseEntity.ok().body(updatedChocolate);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/chocolates/{id}")
    public ResponseEntity<Optional<Chocolate>> deleteChocolate(@PathVariable("id") long id) {
        Optional<Chocolate> deletedChocolate = productService.deleteChocolate(id);
        if (deletedChocolate != null) {
            return ResponseEntity.ok().body(deletedChocolate);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @GetMapping("/getall")
    public ResponseEntity<List<Object>> getAllProducts() {
        List<Object> allProducts = new ArrayList<>();

        List<Apple> apples = productService.getAllApple();
        allProducts.addAll(apples);

        List<Bread> breads = productService.getAllBread();
        allProducts.addAll(breads);

        List<Milk> milks = productService.getAllMilk();
        allProducts.addAll(milks);

        List<Egg> eggs = productService.getAllEgg();
        allProducts.addAll(eggs);

        List<Chocolate> chocolates = productService.getAllChocolate();
        allProducts.addAll(chocolates);

        return ResponseEntity.ok().body(allProducts);
    }
}
