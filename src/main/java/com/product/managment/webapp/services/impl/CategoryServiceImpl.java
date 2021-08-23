package com.product.managment.webapp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.managment.webapp.entities.Category;
import com.product.managment.webapp.repositories.CategoryRepository;
import com.product.managment.webapp.services.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	
	@Override
	public Category saveCategory(Category category) {
		
		return categoryRepository.save(category);
	}

	

	@Override
	public void deleteCategoryById(Long id) {
		categoryRepository.deleteById(id);
		
	}

	@Override
	public Category categoryFindById(Long id) {
	
		return categoryRepository.findById(id).get();
	}

	@Override
	public List<Category> findAllCategories() {
		
		return categoryRepository.findAll();
	}
	
	

}
