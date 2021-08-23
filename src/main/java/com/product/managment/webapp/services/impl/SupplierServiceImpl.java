package com.product.managment.webapp.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.managment.webapp.entities.Supplier;
import com.product.managment.webapp.repositories.SupplierRepository;
import com.product.managment.webapp.services.SupplierService;

@Service
public class SupplierServiceImpl implements SupplierService{

	@Autowired
	private SupplierRepository supplierRepository;
	
	@Override
	public void insert(Supplier supplier) {
		supplierRepository.save(supplier);	
	}

	@Override
	public Optional<Supplier> findById(Long id) {
		
		return supplierRepository.findById(id);
	}

	@Override
	public Iterable<Supplier> findAll() {
		
		return supplierRepository.findAll();
	}

	@Override
	public void updateSupplier(Supplier supplier) {
		supplierRepository.save(supplier);
		
	}

	@Override
	public void deleteSupplier(Supplier supplier) {
		supplierRepository.delete(supplier);
		
	}

}
