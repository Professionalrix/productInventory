package com.product.managment.webapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.managment.webapp.entities.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer>{

}
