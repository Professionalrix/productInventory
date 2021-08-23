package com.product.managment.webapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.managment.webapp.entities.RAM;

@Repository
public interface RAMRepository extends JpaRepository<RAM, Long> {

}
