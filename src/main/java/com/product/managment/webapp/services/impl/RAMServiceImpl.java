package com.product.managment.webapp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.managment.webapp.entities.RAM;
import com.product.managment.webapp.repositories.RAMRepository;
import com.product.managment.webapp.services.RAMService;

@Service
public class RAMServiceImpl implements RAMService {

	@Autowired
	private RAMRepository ramRepository;
	
	@Override
	public List<RAM> getAllDetails() {
			return ramRepository.findAll();
	}

	@Override
	public RAM save(RAM ram) {
		return ramRepository.save(ram);
	}

	@Override
	public RAM FindById(Long id) {
		return ramRepository.findById(id).get();
	}

	@Override
	public void deleteById(Long id) {
	ramRepository.deleteById(id);
	}

}
