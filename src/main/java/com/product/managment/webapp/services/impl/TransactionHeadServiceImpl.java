package com.product.managment.webapp.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.product.managment.webapp.entities.TransactionHead;
import com.product.managment.webapp.repositories.TransactionHeadRepository;
import com.product.managment.webapp.services.TransactionHeadService;

@Service
@Transactional
public class TransactionHeadServiceImpl implements TransactionHeadService{

	@Autowired	
	private TransactionHeadRepository 	transactionHeadRepository;
	
	@Override
	@Transactional
	public TransactionHead insert(TransactionHead transactionHead) {
		
		return transactionHeadRepository.save(transactionHead);
	}

	@Override
	public Iterable<TransactionHead> getAllTransaction() {
		return transactionHeadRepository.findAll();
	}

	@Override
	public TransactionHead getFindById(Long id) {
	
		return transactionHeadRepository.findById(id).get();
	}

	@Override
	public void deleteTransaction(Long id) {
		transactionHeadRepository.deleteById(id);
	}

}
