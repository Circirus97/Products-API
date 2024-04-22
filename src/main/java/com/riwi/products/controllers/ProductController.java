package com.riwi.products.controllers;

import com.riwi.products.entities.Product;
import com.riwi.products.services.service_abstract.IProductService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final IProductService iProductService;

    @GetMapping
    public ResponseEntity< List<Product>> getAll(){
        return ResponseEntity.ok(this.iProductService.getAll());
    }

    @GetMapping("/FindByName/{name}")
    public ResponseEntity<Product> findByName(@PathVariable String name){
        return ResponseEntity.ok(this.iProductService.findByName(name));
    }

    @PostMapping("/save")
    public ResponseEntity<Product> save(@RequestBody Product product){
        return ResponseEntity.ok(this.iProductService.save(product));
    }


}
