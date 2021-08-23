package com.product.managment.webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.managment.webapp.entities.Display;
import com.product.managment.webapp.services.DisplayService;

@RestController
public class DisplayController {

	@Autowired
	private DisplayService displayService;

	@PostMapping("/display")
	public Display savedisplay(@RequestBody Display display) {

		return displayService.saveDisplay(display);
	}

	@GetMapping("/display/{id}")
	Display findRamById(@PathVariable("id") Long id) {

		return displayService.displayFindById(id);
	}

	@PutMapping("/display/{id}")
	Display updatedisplay(@RequestBody Display display, @PathVariable Long id) {

		Display display1 = displayService.displayFindById(id);
		display1.setDiscription(display.getDiscription());
		display1.setName(display.getName());
		return displayService.saveDisplay(display1);
	}

	@DeleteMapping("/display/delete/{id}")
	void deletedisplay(@PathVariable Long id) {
		displayService.deleteById(id);
	}
} 
