package com.product.managment.webapp.services;

import java.util.List;

import com.product.managment.webapp.entities.Stock;

public interface StockService {

	List<Stock> getStock();
	Stock saveStock(Stock stock);
	void deleteStock(Long id);
	Stock findByIdStock(Long id);
	void updateStock(Stock stock);
	Stock findByStoreIdAndProductId(Long storedId, Long productId,Long specId);
	

	
	
}
