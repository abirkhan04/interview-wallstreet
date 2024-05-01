package com.java.ecommerce.service;

import java.time.LocalDate;

public interface SaleService {
    double getTotalSaleForTheDate(LocalDate date);
    LocalDate getMaxSaleDay(LocalDate startDate, LocalDate endDate);
}
