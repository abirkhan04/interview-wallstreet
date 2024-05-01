package com.java.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.ecommerce.entity.Product;
import com.java.ecommerce.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
    @Autowired
    private ProductRepository productRepository;

	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public List<Product> fetchAll() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updateProductById(Long id, Product product) {
		// TODO Auto-generated method stub
		return null;
	}

}
