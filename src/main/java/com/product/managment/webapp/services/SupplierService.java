package com.product.managment.webapp.services;

import java.util.Optional;

import com.product.managment.webapp.entities.Supplier;

public interface SupplierService {

	public void insert(Supplier supplier);
	public Optional<Supplier> findById(Long id);
	public Iterable<Supplier> findAll();
	public void updateSupplier(Supplier supplier);
	public void deleteSupplier(Supplier supplier);
}
