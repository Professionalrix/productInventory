package com.product.managment.webapp.services;

import java.util.List;

import com.product.managment.webapp.entities.Processor;

public interface ProcessorService {

	public List<Processor> getAllProcessor();
	public Processor saveProcessors(Processor processor);
	public Processor processorFindById(Long id);
	public void deleteById(Long id);
}
