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

    @PostMapping("/save")
    public ResponseEntity<Product> save(@RequestBody Product product){
        return ResponseEntity.ok(this.iProductService.save(product));
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Product> update(
            @PathVariable Long id, /* PathVariable porque el ID viene por URL*/
            @RequestBody Product product  /* RequestBody porque los datos vienen por el cuerpo de la peticion*/
    ){
        return ResponseEntity.ok(this.iProductService.update(id, product));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        this.iProductService.delete(id);
        return ResponseEntity.ok("Se elimino correctamente");
    }


    @GetMapping("/findByName/{name}")
    public ResponseEntity<Product> findByName(@PathVariable String name){
        return ResponseEntity.ok(this.iProductService.findByName(name));
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        return ResponseEntity.ok(this.iProductService.findById(id));
    }


}
