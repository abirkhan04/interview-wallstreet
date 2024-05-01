package com.java.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.ecommerce.entity.Customer;
import com.java.ecommerce.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer getCustomerById(Long customerId) {
		// TODO Auto-generated method stub
		return customerRepository.findById(customerId).get();
	}

}
