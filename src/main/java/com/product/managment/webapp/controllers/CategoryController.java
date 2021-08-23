package com.product.managment.webapp.controllers;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.managment.webapp.entities.Category;
import com.product.managment.webapp.services.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping("")
	public List<Category> SubCategory() {

		/*
		 * model.addAttribute("title", "Sub-Category");
		 * 
		 * model.addAttribute("categoryList", categoryService.findAllCategories());
		 */
		return categoryService.findAllCategories();
	}

	@PostMapping("")
	public Category saveCategory(@RequestBody Category category) {
		category.setTime(LocalDateTime.now());

		Category persistedcategory = categoryService.saveCategory(category);
		if (persistedcategory != null) {
			return persistedcategory;
		}

		return null;
	}
	
	
	/* Category findBy Id */
	@GetMapping("/{id}")
	public Category findById1(@PathVariable Long id) {
				
	 return categoryService.categoryFindById(id);

	}


	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteProductById(@PathVariable Long id) {

		categoryService.deleteCategoryById(id);
		try {
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			// TODO: handle exception
		}

		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}

}
