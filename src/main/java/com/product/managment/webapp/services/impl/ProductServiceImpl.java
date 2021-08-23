package com.product.managment.webapp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.managment.webapp.entities.Product;
import com.product.managment.webapp.repositories.ProductRepository;
import com.product.managment.webapp.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> allProducts() {
	return productRepository.findAll();
	}

	@Override
	public Product saveProduct(Product product) {

		return productRepository.save(product);
	}

	@Override
	public Product productFindById(Long id) {

		return productRepository.findById(id).get();
	}

	@Override
	public void deleteById(Long id) {
		productRepository.deleteById(id);

	}

}
