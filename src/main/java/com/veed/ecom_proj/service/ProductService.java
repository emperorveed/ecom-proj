package com.veed.ecom_proj.service;

import com.veed.ecom_proj.model.Product;
import com.veed.ecom_proj.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository repository;

    public List<Product> getAllProducts() {

       return repository.findAll();
    }

    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
    }
}
