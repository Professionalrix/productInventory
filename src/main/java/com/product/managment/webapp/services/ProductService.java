package com.product.managment.webapp.services;

import java.util.List;

import com.product.managment.webapp.entities.Product;

public interface ProductService {

		public List<Product> allProducts();
		public Product saveProduct(Product product);
		public Product productFindById(Long id);
		public void deleteById(Long id);
		

}
