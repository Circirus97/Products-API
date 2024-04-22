package com.riwi.products.services.service_abstract;

import com.riwi.products.entities.Product;

import java.util.List;

public interface IProductService {


        Product save(Product product);

        List<Product> getAll();

        Product findById(Long id);

        Boolean delete(Long id);

        Product update(Long id);

        List<Product> search(String name);
        
}
