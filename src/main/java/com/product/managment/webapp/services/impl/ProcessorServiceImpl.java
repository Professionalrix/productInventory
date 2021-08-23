package com.product.managment.webapp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.managment.webapp.entities.Processor;
import com.product.managment.webapp.repositories.ProcessorRepository;
import com.product.managment.webapp.services.ProcessorService;

@Service
public class ProcessorServiceImpl implements ProcessorService{
	
	@Autowired
	private ProcessorRepository processorRepository;
	
	@Override
	public List<Processor> getAllProcessor() {
		
		return processorRepository.findAll();
	}

	@Override
	public Processor saveProcessors(Processor processor) {
		
		return processorRepository.save(processor);
	}

	@Override
	public Processor processorFindById(Long id) {
		
		return processorRepository.findById(id).get();
	}

	@Override
	public void deleteById(Long id) {
		processorRepository.deleteById(id);
		
	}

}
