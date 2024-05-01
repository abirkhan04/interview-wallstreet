package com.java.ecommerce.service;

import java.time.LocalDate;
import java.util.List;

public interface SaleService {
    double getTotalSaleForTheDate(LocalDate date);
    LocalDate getMaxSaleDay(LocalDate startDate, LocalDate endDate);
    List<String> getTop5SellingItems();

	List<String> getTop5SellingItemsInDateRange(LocalDate startDate, LocalDate endDate);
}
