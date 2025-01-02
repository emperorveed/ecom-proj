package com.veed.ecom_proj.repository;

import com.veed.ecom_proj.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
