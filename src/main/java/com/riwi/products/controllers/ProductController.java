package com.riwi.products.controllers;

import com.riwi.products.entities.Product;
import com.riwi.products.services.service_abstract.IProductService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@AllArgsConstructor
public class ProductController {

    @Autowired
    private IProductService productService;
    @GetMapping
    public ResponseEntity< List<Product>> getAll(){
        return ResponseEntity.ok(this.productService.getAll());

    }
}
