package com.java.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.ecommerce.entity.Customer;
import com.java.ecommerce.entity.Wish;

public interface WishRepository extends JpaRepository<Wish, Long>{
	List<Wish> findByCustomer(Customer customer);
}
