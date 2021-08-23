package com.product.managment.webapp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.managment.webapp.entities.Stock;
import com.product.managment.webapp.repositories.StockRepository;
import com.product.managment.webapp.services.StockService;

@Service

public class StockServiceImpl implements StockService{

	@Autowired
	private StockRepository stockRepository;
	
	@Override
	public List<Stock> getStock() {
		return stockRepository.findAll();
	}

	@Override
	public Stock saveStock(Stock stock) {
			return stockRepository.save(stock);
	}

	@Override
	public void deleteStock(Long id) {
		stockRepository.deleteById(id);
		
	}

	@Override
	public Stock findByIdStock(Long id) {
			return null;
	}

	@Override
	public void updateStock(Stock stock) {
		stockRepository.save(stock);
		
	}

	@Override
	public Stock findByStoreIdAndProductId(Long storedId, Long productId,Long specId) {
		Stock stock=stockRepository.findCustom(storedId,productId,specId);
		if(stock !=null) {
			return stock;
		}
		return null;
	}

	

}
