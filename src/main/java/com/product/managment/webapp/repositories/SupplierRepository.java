package com.product.managment.webapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.managment.webapp.entities.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Long>{

}
