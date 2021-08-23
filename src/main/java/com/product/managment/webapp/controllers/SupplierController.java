package com.product.managment.webapp.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.managment.webapp.entities.Supplier;
import com.product.managment.webapp.services.SupplierService;

@RestController
public class SupplierController {

	@Autowired
	private SupplierService supplierService;

	@GetMapping("/suppliers")
	public Iterable<Supplier> getAllSupplier() {
		return supplierService.findAll();

	}

	@GetMapping("/suppliers/{id}")
	public Optional<Supplier> searchSupplier(@PathVariable Long id) {
		return supplierService.findById(id);
	}

	@PostMapping("/suppliers")
	public void addCategory(@RequestBody Supplier supplier) {
		supplierService.insert(supplier);

	}

	@PutMapping("/suppliers/{id}")
	public void updateCategory(@RequestBody Supplier supplier) {
		supplierService.updateSupplier(supplier);

	}

	@DeleteMapping("suppliers/{id}")
	public void deleteCategory(@RequestBody Supplier supplier) {
	supplierService.deleteSupplier(supplier);
	}

}
