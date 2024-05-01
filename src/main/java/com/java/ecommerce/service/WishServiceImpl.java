package com.java.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.ecommerce.entity.Customer;
import com.java.ecommerce.entity.Wish;
import com.java.ecommerce.repository.WishRepository;

@Service
public class WishServiceImpl implements WishService {

    @Autowired
    private WishRepository wishRepository;

    @Override
    public List<Wish> getWishesByCustomer(Customer customer) {
        return wishRepository.findByCustomer(customer);
    }
}
