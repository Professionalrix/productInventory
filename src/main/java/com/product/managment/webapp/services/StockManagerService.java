package com.product.managment.webapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.config.TxNamespaceHandler;

import com.product.managment.webapp.entities.TransactionHead;
import com.product.managment.webapp.repositories.StockRepository;
import com.product.managment.webapp.repositories.TransactionDetailRepository;
import com.product.managment.webapp.repositories.TransactionHeadRepository;

@Service
public class StockManagerService {
	
	@Autowired
	private StockRepository stockRepository;
	@Autowired
	private TransactionDetailRepository txnDetialsRepo;

	@Autowired
	private TransactionHeadRepository txnHeadRepo;
	

	public String addNewTransaction(TransactionHead transactionHead) { // Meta object 
		
		// For loop each entry of tansaction detail from meta object
		// TransactionDetail txnDetail = new TransactionDetail()
		// txnDetailsRepo.save(txnDetail)
		// For loop each entry of trasaction detail from meta object
		// Stock stock = stockRepository.queryByStoreIdAndProductId(storeId, productId)
		// if (stock == null) { 
		//      stock = new Stock();
		//      Store store storeRepository.getById(storedId)
		//      Prouct product = productRepository.getByuId(productId)
		//      stock.setStore(store)
		//      stork.setProduct(product) // .... Add other information also
		//  }
		// stock.setQuantity(stock.getQuantity() + quantity)
		// stockRepository.save(stock)
		// return statement
		
		return null;
	}
	
}
