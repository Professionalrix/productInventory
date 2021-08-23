package com.product.managment.webapp.controllers;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.managment.webapp.entities.Product;
import com.product.managment.webapp.services.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("")
	public Iterable<Product> getAllProduct() {
		return productService.allProducts();
	}

	@GetMapping("/{id}")
	public Product getProductById(@PathVariable Long id) {
		return productService.productFindById(id);
	}

	@PostMapping("")
	public Product saveProduct(@RequestBody Product product) throws URISyntaxException {

		return productService.saveProduct(product);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Product> updateProductById(@RequestBody Product product, @PathVariable("id") Long id) {
		Product foundProduct = productService.productFindById(id);
		if (foundProduct == null) {
			return ResponseEntity.notFound().build();
		} else {
			productService.saveProduct(product);

			return ResponseEntity.ok(product);
		}

	}

	@DeleteMapping("/{id}")
	ResponseEntity<Void> deleteproduct(@PathVariable Long id) {

		Product product = productService.productFindById(id);

		if (product == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
			productService.deleteById(id);

		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
