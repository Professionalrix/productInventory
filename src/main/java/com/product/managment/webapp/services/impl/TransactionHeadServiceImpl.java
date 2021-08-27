package com.product.managment.webapp.services.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.product.managment.webapp.entities.ResponseFromDate;
import com.product.managment.webapp.entities.StockLedger;
import com.product.managment.webapp.entities.TransactionDetail;
import com.product.managment.webapp.entities.TransactionHead;
import com.product.managment.webapp.model.ResponseClass;
import com.product.managment.webapp.repositories.TransactionDetailRepository;
import com.product.managment.webapp.repositories.TransactionHeadRepository;
import com.product.managment.webapp.services.TransactionHeadService;

@Service
@Transactional
public class TransactionHeadServiceImpl implements TransactionHeadService {

	@Autowired
	private TransactionHeadRepository transactionHeadRepository;

	@Autowired
	private TransactionDetailRepository transactionDetailRepository;
	
	
	@Override
	@Transactional
	public TransactionHead insert(TransactionHead transactionHead) {

		return transactionHeadRepository.save(transactionHead);
	}

	@Override
	public Iterable<TransactionHead> getAllTransaction() {
		return transactionHeadRepository.findAll();
	}

	@Override
	public TransactionHead getFindById(Long id) {

		return transactionHeadRepository.findById(id).get();
	}

	@Override
	public void deleteTransaction(Long id) {
		transactionHeadRepository.deleteById(id);
	}

	@Override
	public ResponseFromDate formDate(Long productId, Long StoreId, Date date) {
		double inwardQuantity = 0;
		double outwardQuantity = 0;
		ResponseFromDate response=new ResponseFromDate();
		List<TransactionHead> txnHead = transactionHeadRepository.findAllWithCreationDateTimeBefore(date, StoreId);
		for (TransactionHead txnHeadList : txnHead) {

			if (txnHeadList.getType().equals("outward")) {

				List<TransactionDetail> txnDetailList = transactionDetailRepository
						.getTransactionfromDate(txnHeadList.getId(), productId);

				for (TransactionDetail txnDetail : txnDetailList) {
					outwardQuantity += txnDetail.getQuantity();
					response.setOutwardQuantity(outwardQuantity);
				}
			} else {
				List<TransactionDetail> txnDetailList = transactionDetailRepository
						.getTransactionfromDate(txnHeadList.getId(), productId);

				for (TransactionDetail txnDetail : txnDetailList) {
					inwardQuantity += txnDetail.getQuantity();
                 response.setInwardQuantity(inwardQuantity);
				}

			}

		}
		
		System.out.println("Total inward :" + inwardQuantity);
		System.out.println("Total outward :" + outwardQuantity);
		System.out.println("Net Quantity : " + (inwardQuantity - outwardQuantity));
		response.setNetQuantity(inwardQuantity - outwardQuantity);
		return response;
			}

	@Override
	public ResponseClass betweenDate(Long productId, Long storeId, Date startDate, Date endDate) {
	
		ResponseClass response=new ResponseClass();
		List<ResponseClass> responseList=new ArrayList<>();
		
		double inwardQuantity = 0;
		double outwardQuantity = 0;
		
		List<TransactionHead> txnHead = transactionHeadRepository.findAllWithTransactionDateBetween(startDate,endDate, storeId); 
		for(TransactionHead txnHeadList: txnHead) {
			
				if (txnHeadList.getType().equals("outward")) {

					List<TransactionDetail> txnDetailList = transactionDetailRepository
							.getTransactionfromDate(txnHeadList.getId(), productId);

					for (TransactionDetail txnDetail : txnDetailList) {
						response.setProductName(txnDetail.getProduct().getProductName());
						
						outwardQuantity += txnDetail.getQuantity();
					}
					response.setSupplierName(txnHeadList.getSupplier().getSupplierName());
					response.setProductId(productId);
				} else {
					List<TransactionDetail> txnDetailList = transactionDetailRepository
							.getTransactionfromDate(txnHeadList.getId(), productId);

					for (TransactionDetail txnDetail : txnDetailList) {
						inwardQuantity += txnDetail.getQuantity();
                       
					}

				}
				
				
		}
		//response.setOpeningStock(openingStock);
		response.setOutwardQwantity(outwardQuantity);
		response.setInwardQuantity(inwardQuantity);
		response.setClosingStock((inwardQuantity-outwardQuantity));
		System.out.println(outwardQuantity);
		System.out.println(inwardQuantity);
		System.out.println("Net Quantity :" +(inwardQuantity-outwardQuantity));
		return response;
	}

	@Override
	public void transactionBetweenDate(StockLedger stockLedger) {
		double inwardQuantity = 0;
		double outwardQuantity = 0;
		//List<TransactionHead> txnHead = transactionHeadRepository.transactionBetweenDate(stockLedger.getFromDate(),stockLedger.getToDate(),stockLedger.getStoreId()); 
		System.out.println("hello");	
		
	}

}
