package com.product.managment.webapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.managment.webapp.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
