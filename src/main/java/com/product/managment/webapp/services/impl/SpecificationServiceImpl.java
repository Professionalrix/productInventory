package com.product.managment.webapp.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.managment.webapp.entities.Specification;
import com.product.managment.webapp.repositories.SpecificationRepository;
import com.product.managment.webapp.services.SpecificationService;

@Service
public class SpecificationServiceImpl implements SpecificationService {
		
	@Autowired
	private  SpecificationRepository specificationRepository;
	
	@Override
	public void insert(Specification specification) {
		specificationRepository.save(specification);
	}

	@Override
	public Optional<Specification> findById(Long id) {
		return specificationRepository.findById(id);
	}

	@Override
	public Iterable<Specification> findAll() {
		return specificationRepository.findAll();
	}

	@Override
	public void updateSpecification(Specification specification) {
		specificationRepository.save(specification);
	}

	@Override
	public void deleteSpecification(Specification specification) {
		specificationRepository.delete(specification);
	}

}
