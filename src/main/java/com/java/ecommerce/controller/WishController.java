package com.java.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.ecommerce.entity.Customer;
import com.java.ecommerce.entity.Wish;
import com.java.ecommerce.service.CustomerService;
import com.java.ecommerce.service.WishService;

import java.util.List;

@RestController
@RequestMapping("/api/wishes")
public class WishController {

    @Autowired
    private WishService wishService;
    
    @Autowired
    private CustomerService customerService;

    @GetMapping("/{customerId}")
    public List<Wish> getWishesByCustomer(@PathVariable Long customerId) {
        // Assuming you have a service method to retrieve customer by ID
        Customer customer = customerService.getCustomerById(customerId);
        if (customer == null) {
            // Handle customer not found error
        }
        
        return wishService.getWishesByCustomer(customer);
    }
}
