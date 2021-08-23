package com.product.managment.webapp.services;

import java.util.List;

import com.product.managment.webapp.entities.RAM;

public interface RAMService {
	
	public List<RAM> getAllDetails();
	public RAM save(RAM ram);
	public RAM FindById(Long id);
	public void deleteById(Long id);

}
