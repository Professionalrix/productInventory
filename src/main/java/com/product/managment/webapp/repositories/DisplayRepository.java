package com.product.managment.webapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.managment.webapp.entities.Display;

@Repository
public interface DisplayRepository extends JpaRepository<Display,Long>{

}
