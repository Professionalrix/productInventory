package com.product.managment.webapp.services;

import java.util.List;

import com.product.managment.webapp.entities.TransactionDetail;

public interface TransactionDetailService {
	
	List<TransactionDetail> getTranscation();
	TransactionDetail findById(Long id);
	TransactionDetail saveTransaction(TransactionDetail transaction);
	void deleteTransaction(Long id);

}
