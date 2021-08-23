package com.product.managment.webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.managment.webapp.services.StockManagerService;

@RestController
@RequestMapping("/inventory")
public class StockManagerController {

	@Autowired
	private StockManagerService stockManagerService;
	
	@PostMapping("")
	public String addNewTransaction() {
		
		return null;
	}
	
}
