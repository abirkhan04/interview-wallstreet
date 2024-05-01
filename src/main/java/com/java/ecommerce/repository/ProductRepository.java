package com.java.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.ecommerce.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{}
