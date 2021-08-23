package com.product.managment.webapp.services;

import java.util.List;

import com.product.managment.webapp.entities.Display;

public interface DisplayService {

		public List<Display> getAllDisplays();
		public Display saveDisplay(Display display);
		public Display displayFindById(Long id);
		public void deleteById(Long id);
	
}
