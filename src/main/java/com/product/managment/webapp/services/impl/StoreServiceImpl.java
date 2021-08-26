package com.product.managment.webapp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.managment.webapp.entities.Store;
import com.product.managment.webapp.repositories.StoreRepository;
import com.product.managment.webapp.services.StoreService;

@Service
public class StoreServiceImpl implements StoreService{

	@Autowired
	private StoreRepository storeRepository;
	
	@Override
	public List<Store> getAllStoreList() {
		return storeRepository.findAll();
	}

}
