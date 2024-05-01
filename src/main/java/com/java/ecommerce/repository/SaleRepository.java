package com.java.ecommerce.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.java.ecommerce.entity.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
     List<Sale> findByDate(LocalDate date);
     List<Sale> findByDateBetween(LocalDate startDate, LocalDate endDate);
}
