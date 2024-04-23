package com.riwi.products.services;

import com.riwi.products.entities.Product;
import com.riwi.products.repositories.ProductRepository;
import com.riwi.products.services.service_abstract.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService implements IProductService {

    private final ProductRepository productRepository;

    @Override
    public Product save(Product product) {
        return this.productRepository.save(product);
    }

    @Override
    public List<Product> getAll() {
        return this.productRepository.findAll();
    }

    @Override
    public Product findById(Long id) {
        return this.productRepository.findById(id).orElseThrow();
    }

    @Override
    public void delete(Long id) {
        this.productRepository.deleteById(id);
    }


    @Override
    public Product update(Long id, Product product) {
        this.productRepository.findById(id).orElseThrow();
        product.setId(id);

        return this.productRepository.save(product);
    }

    @Override
    public Product findByName(String name) {
        return this.productRepository.findByName(name);
    }
}
