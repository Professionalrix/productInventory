package com.product.managment.webapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.product.managment.webapp.entities.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {

	@Query(value="from com.product.managment.webapp.entities.Stock s where s.storeId=:storedId and s.productId=:productId and s.SpecifictionId=:specId")
	Stock findCustom(Long storedId, Long productId,Long specId);

}
