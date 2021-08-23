package com.product.managment.webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.managment.webapp.entities.Stock;
import com.product.managment.webapp.services.StockService;

@RestController
@RequestMapping("/stock")
public class StockController {

	@Autowired
	private StockService stockService;

	/* get All Stock */
	
	@GetMapping("")
	public Iterable<Stock> getAllStock() {
		return stockService.getStock();
	}

	
	@GetMapping("/{id}")
	public Stock findById(@PathVariable("id") Long id) {
		return stockService.findByIdStock(id);
		
	}
	
	
	/* save Stock */
	
	@PostMapping("/save")
	public void addStock(@RequestBody Stock stock) {
		
		stockService.saveStock(stock);
	}

	/* update stock */
	
	@PutMapping("/stock/{id}")
	public void updateStock(@RequestBody Stock stock, @PathVariable("id") Long id) {
		Stock stock1 = stockService.findByIdStock(id);
		if (stock1 != null) {
			stockService.updateStock(stock);
		}
	}

	
	/* Delete Stock */
	
	@DeleteMapping("/stock/{id}")
	public void deleteStock(@PathVariable Long id) {
		stockService.deleteStock(id);
	}

}
