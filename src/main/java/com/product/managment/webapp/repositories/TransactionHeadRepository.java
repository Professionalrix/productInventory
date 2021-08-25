package com.product.managment.webapp.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.product.managment.webapp.entities.TransactionHead;

@Repository
public interface TransactionHeadRepository extends JpaRepository<TransactionHead,Long>{

	 @Query("from com.product.managment.webapp.entities.TransactionHead a where a.transactionDate <=:transactiontime and a.storeId=:storeId")
	    List<TransactionHead> findAllWithCreationDateTimeBefore( Date transactiontime,Long storeId);
	
	 @Query("from com.product.managment.webapp.entities.TransactionHead a where a.transactionDate>=:startDate and a.transactionDate<=:endDate and a.storeId=:storeId")
	 List<TransactionHead> findAllWithTransactionDateBetween( Date startDate,Date endDate,Long storeId);
}
