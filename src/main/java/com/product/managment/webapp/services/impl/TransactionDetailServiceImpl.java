package com.product.managment.webapp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.managment.webapp.entities.TransactionDetail;
import com.product.managment.webapp.repositories.TransactionDetailRepository;
import com.product.managment.webapp.services.TransactionDetailService;

@Service
public class TransactionDetailServiceImpl implements TransactionDetailService {

	@Autowired
	private TransactionDetailRepository transactionRepository;
	
	@Override
	public List<TransactionDetail> getTranscation() {
		return transactionRepository.findAll();
	}

	@Override
	public TransactionDetail findById(Long id) {
	
		return transactionRepository.findById(id).get();
	}

	@Override
	public TransactionDetail saveTransaction(TransactionDetail transaction) {
		return transactionRepository.save(transaction);
	}

	@Override
	public void deleteTransaction(Long id) {
		transactionRepository.deleteById(id);
		
	}

}
