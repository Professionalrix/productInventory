package com.product.managment.webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.managment.webapp.entities.Processor;
import com.product.managment.webapp.services.ProcessorService;

@RestController
public class ProcessorController {

	@Autowired
	private ProcessorService processorService;

	@PostMapping("/processor")
	public Processor saveRAM(@RequestBody Processor processor) {

		return processorService.saveProcessors(processor);
	}

	@GetMapping("/processor/{id}")
	Processor findRamById(@RequestBody @PathVariable("id") Long id) {

		return processorService.processorFindById(id);
	}

	@PutMapping("/processor/{id}")
	Processor updateRam(@RequestBody Processor processor, @PathVariable Long id) {

		Processor processor1 = processorService.processorFindById(id);
		
		
		processor1.setDiscription(processor.getDiscription());
		processor1.setProcessorName(processor.getProcessorName());

		return processorService.saveProcessors(processor1);
	}

	@DeleteMapping("/processor/delete/{id}")
	void deleteram(@PathVariable Long id) {
		processorService.deleteById(id);
	}
	
	
	
	
}
