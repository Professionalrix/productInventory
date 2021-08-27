package com.product.managment.webapp.services;

import java.util.Date;

import com.product.managment.webapp.entities.ResponseFromDate;
import com.product.managment.webapp.entities.StockLedger;
import com.product.managment.webapp.entities.TransactionHead;
import com.product.managment.webapp.model.ResponseClass;

public interface TransactionHeadService {
	
	public TransactionHead insert(TransactionHead transactionHead);
	public Iterable<TransactionHead> getAllTransaction();
	public TransactionHead getFindById(Long id);
	public void deleteTransaction(Long id);
	public ResponseFromDate formDate(Long productId, Long storeId, Date date);
	public ResponseClass betweenDate(Long productId, Long StoreId, Date startDate, Date endDate);
	public void transactionBetweenDate(StockLedger stockLedger);

}
