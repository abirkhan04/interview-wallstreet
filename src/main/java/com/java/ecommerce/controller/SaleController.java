package com.java.ecommerce.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.java.ecommerce.service.SaleService;

@RestController
public class SaleController {

	@Autowired
	private SaleService saleService;

	@GetMapping("/api/sales/total")
	public double getTotalSaleAmountForDate(
			@RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
		return saleService.getTotalSaleForTheDate(date);
	}

	@GetMapping("/api/sales/max-day/between")
	public LocalDate getTotalSaleAmountForDateRange(
			@RequestParam("startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
			@RequestParam("endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) {
		return saleService.getMaxSaleDay(startDate, endDate);
	}

	@GetMapping("/api/sales/top-5")
	public List<String> getTop5SellingItems() {
		return saleService.getTop5SellingItems();
	}

	@GetMapping("/api/sales/top-5/date-range")
	public List<String> getTop5SellingItemsInDateRange(
			@RequestParam("startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
			@RequestParam("endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) {
		return saleService.getTop5SellingItemsInDateRange(startDate, endDate);
	}

}
