package com.product.managment.webapp.services;

import java.util.Optional;

import com.product.managment.webapp.entities.Specification;

public interface SpecificationService {
	
	public void insert(Specification specification);
	public Optional<Specification> findById(Long id);
	public Iterable<Specification> findAll();
	public void updateSpecification(Specification specification);
	public void deleteSpecification(Specification specification);

}
