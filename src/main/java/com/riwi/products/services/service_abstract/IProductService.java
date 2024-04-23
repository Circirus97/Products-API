package com.riwi.products.services.service_abstract;

import com.riwi.products.entities.Product;

import java.util.List;


public interface IProductService {

        Product save(Product product);

        List<Product> getAll();

        Product findById(Long id);

        void delete(Long id);

        Product update(Long id,  Product product);

        Product findByName(String name);
        
}
