package com.example.stockspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockspring.dao.StockPriceDao;
import com.example.stockspring.model.StockPrice;
@Service
public class StockPriceServiceImple implements StockPriceService{
    
	@Autowired
	StockPriceDao stockpriceDao;
	@Override
	public List<StockPrice> getAllStockPrice() {
		return stockpriceDao.findAll();
	}

}
