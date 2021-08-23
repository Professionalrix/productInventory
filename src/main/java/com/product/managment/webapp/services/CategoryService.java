package com.product.managment.webapp.services;

import java.util.List;

import com.product.managment.webapp.entities.Category;

public interface CategoryService {

		public Category saveCategory(Category category);

		public void deleteCategoryById(Long id);
		public Category categoryFindById(Long id);
		public List<Category> findAllCategories();
		
}
