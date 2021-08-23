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
import com.product.managment.webapp.entities.Specification;
import com.product.managment.webapp.services.SpecificationService;

@RestController
public class SpecificationController {

	@Autowired
	private SpecificationService specificationService;

	@GetMapping("/specification")
	public Iterable<Specification> getAllSupplier() {
		return specificationService.findAll();

	}

	@GetMapping("/specification/{id}")
	public Optional<Specification> searchSpecification(@PathVariable Long id) {
		return specificationService.findById(id);
	}

	@PostMapping("/specification")
	public void addSpecification(@RequestBody Specification specification) {
		specificationService.insert(specification);

	}

	@PutMapping("/specification/{id}")
	public void updateCategory(@RequestBody Specification specification) {
		specificationService.insert(specification);
	}

	@DeleteMapping("specification/{id}")
	public void deleteCategory(@RequestBody Specification specification) {
		specificationService.deleteSpecification(specification);
	}

}
