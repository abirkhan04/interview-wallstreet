package com.java.ecommerce.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.ecommerce.entity.Sale;
import com.java.ecommerce.repository.SaleRepository;

@Service
public class SaleServiceImpl implements SaleService {

	@Autowired
	private SaleRepository saleRepository;

	@Override
	public double getTotalSaleForTheDate(LocalDate date) {
		List<Sale> sales = saleRepository.findByDate(date);
		double totalSaleAmount = 0.0;
		for (Sale sale : sales) {
			totalSaleAmount = totalSaleAmount + (sale.getAmount());
		}
		return totalSaleAmount;
	}
    
    
    private List<LocalDate> getDatesInRange(LocalDate startDate, LocalDate endDate) {
        List<LocalDate> datesInRange = new ArrayList<LocalDate>();
        LocalDate date = startDate;
        while (!date.isAfter(endDate)) {
            datesInRange.add(date);
            date = date.plusDays(1);
        }
        return datesInRange;
    }
    
    @Override
	public LocalDate getMaxSaleDay(LocalDate startDate, LocalDate endDate) {
    	List<LocalDate> datesInRange = getDatesInRange(startDate, endDate);
    	double maxSales = Double.MIN_VALUE;
    	LocalDate localDate = LocalDate.parse("1979-01-01");
    	for(LocalDate date : datesInRange) {
    		double totalSales = getTotalSaleForTheDate(date);
    		if(totalSales > maxSales) {
    			maxSales = totalSales;
    			localDate = date;
    		}
    	}
    	return localDate;
    }

}
