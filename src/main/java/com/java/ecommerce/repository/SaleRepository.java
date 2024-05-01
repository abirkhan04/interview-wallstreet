package com.java.ecommerce.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.java.ecommerce.entity.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	List<Sale> findByDate(LocalDate date);

	List<Sale> findByDateBetween(LocalDate startDate, LocalDate endDate);

	@Query("SELECT s.item.name, SUM(s.amount) AS totalAmount " + "FROM Sale s " + "GROUP BY s.item "
			+ "ORDER BY totalAmount DESC")
	List<String> findTop5SellingItems();

	@Query("SELECT s.item.name, SUM(s.amount) AS totalSales " + "FROM Sale s "
			+ "WHERE s.date BETWEEN :startDate AND :endDate " + "GROUP BY s.item.name " + "ORDER BY totalSales DESC")
	List<String> findTop5SellingItemsOfDateRange(LocalDate startDate, LocalDate endDate);
}
