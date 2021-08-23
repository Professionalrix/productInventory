package com.product.managment.webapp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.managment.webapp.entities.Display;
import com.product.managment.webapp.repositories.DisplayRepository;
import com.product.managment.webapp.services.DisplayService;

@Service
public class DisplayServiceImpl implements DisplayService {

	@Autowired
	private DisplayRepository displayRepository;
	
	@Override
	public List<Display> getAllDisplays() {

		return  displayRepository.findAll();
	}

	@Override
	public Display saveDisplay(Display display) {
		
		return displayRepository.save(display);
	}

	@Override
	public Display displayFindById(Long id) {
		
		return displayRepository.findById(id).get();
	}

	@Override
	public void deleteById(Long id) {
		displayRepository.deleteById(id);
		
	}

}
