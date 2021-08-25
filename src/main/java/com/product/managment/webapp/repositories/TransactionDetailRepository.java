package com.product.managment.webapp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.product.managment.webapp.entities.TransactionDetail;

@Repository
public  interface TransactionDetailRepository extends JpaRepository<TransactionDetail, Long> {

	@Query(value="from com.product.managment.webapp.entities.TransactionDetail a where a.transactionHeadId=:transactionHeadId and a.productId=:productId")
	List<TransactionDetail> getTransactionfromDate(Long transactionHeadId,Long productId);


}
