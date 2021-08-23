package com.product.managment.webapp.services;

import com.product.managment.webapp.entities.TransactionHead;

public interface TransactionHeadService {
	
	public TransactionHead insert(TransactionHead transactionHead);
	public Iterable<TransactionHead> getAllTransaction();
	public TransactionHead getFindById(Long id);
	public void deleteTransaction(Long id);

}
