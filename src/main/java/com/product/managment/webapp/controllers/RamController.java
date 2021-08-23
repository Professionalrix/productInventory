package com.product.managment.webapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.managment.webapp.entities.RAM;
import com.product.managment.webapp.services.RAMService;

@RestController
public class RamController {

	@Autowired
	private RAMService ramService;

	@PostMapping("/ram")
	public RAM saveRAM(@RequestBody RAM ram) {

		return ramService.save(ram);
	}
	
	@GetMapping("/ram")
	public List<RAM> getAllRAM(@RequestBody RAM ram) {

		return ramService.getAllDetails();
	}
	

	@GetMapping("/ram/{id}")
	RAM findRamById(@PathVariable("id") Long id) {

		return ramService.FindById(id);
	}

	@PutMapping("/ram/{id}")
	RAM updateRam(@RequestBody RAM ram, @PathVariable Long id) {

		RAM ram1 = ramService.FindById(id);
		ram1.setRamSize(ram.getRamSize());
		ram1.setDiscription(ram.getDiscription());

		return ramService.save(ram);
	}

	@DeleteMapping("/ram/delete/{id}")
	void deleteram(@PathVariable Long id) {
		ramService.deleteById(id);
	}

}
