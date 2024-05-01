package com.java.ecommerce.service;

import java.util.List;

import com.java.ecommerce.entity.Customer;
import com.java.ecommerce.entity.Wish;

public interface WishService {
	public List<Wish> getWishesByCustomer(Customer customer);
}    
