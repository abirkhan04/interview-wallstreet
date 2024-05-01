package com.java.ecommerce.service;

import java.util.List;

import com.java.ecommerce.entity.Product;

public interface ProductService {

    Product save(Product product);
    List<Product> fetchAll();
    Product getProductById(Long id);
    Product updateProductById(Long id, Product product);
    // String deleteDepartmentById(Long id);
}
