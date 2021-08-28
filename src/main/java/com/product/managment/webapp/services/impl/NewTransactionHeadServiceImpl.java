package com.product.managment.webapp.services.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.managment.webapp.entities.ResponseFromDate;
import com.product.managment.webapp.entities.StockLedger;
import com.product.managment.webapp.entities.TransactionDetail;
import com.product.managment.webapp.entities.TransactionHead;
import com.product.managment.webapp.model.ResponseClass;
import com.product.managment.webapp.model.ResponseStockTracking;
import com.product.managment.webapp.repositories.TransactionDetailRepository;
import com.product.managment.webapp.repositories.TransactionHeadRepository;
import com.product.managment.webapp.services.TransactionHeadService;

@Service
public class NewTransactionHeadServiceImpl implements TransactionHeadService {

	@Autowired
	private TransactionHeadRepository transactionHeadRepository;
	
	@Autowired
	private TransactionDetailRepository transactionDetailRepository;
	 
	@Override
	public TransactionHead insert(TransactionHead transactionHead) {
	return null;
	}
	@Override
	public Iterable<TransactionHead> getAllTransaction() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TransactionHead getFindById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteTransaction(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double formDate(Long productId, Long storeId, Date date) {
		
		double inwardQuantity = 0;
		double outwardQuantity = 0;
		ResponseFromDate response = new ResponseFromDate();
		List<TransactionHead> txnHead = transactionHeadRepository.findAllWithCreationDateTimeBefore(date, storeId);
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
					
				}
			}
		}
		System.out.println("Total inward :" + inwardQuantity);
		System.out.println("Total outward :" + outwardQuantity);
		System.out.println("Net Quantity : " + (inwardQuantity - outwardQuantity));
		response.setNetQuantity(inwardQuantity - outwardQuantity);
		return (inwardQuantity - outwardQuantity);
		

	}

	@Override
	public ResponseClass betweenDate(Long productId, Long storeId, Date startDate, Date endDate) {
		ResponseClass response = new ResponseClass();
	
		double inwardQuantity = 0;
		double outwardQuantity = 0;

		List<TransactionHead> txnHead = transactionHeadRepository.findAllWithTransactionDateBetween(startDate, endDate,
				storeId);
		for (TransactionHead txnHeadList : txnHead) {
			if (txnHeadList.getType().equals("outward")) {
				List<TransactionDetail> txnDetailList = transactionDetailRepository
						.getTransactionfromDate(txnHeadList.getId(), productId);
				for (TransactionDetail txnDetail : txnDetailList) {

					outwardQuantity += txnDetail.getQuantity();
				}
	
			} else {
				List<TransactionDetail> txnDetailList = transactionDetailRepository
						.getTransactionfromDate(txnHeadList.getId(), productId);
				for (TransactionDetail txnDetail : txnDetailList) {
					inwardQuantity += txnDetail.getQuantity();

				}}}
			
				response.setTotalInward(inwardQuantity);
				response.setTotalOutward(outwardQuantity);
		
		return response;	
	
	}

	@Override
	public void transactionBetweenDate(StockLedger stockLedger) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	@Override
	public List<ResponseStockTracking> stockTracking(StockLedger stockLedger) {
		
		List<ResponseStockTracking> responseList= new ArrayList<>();
		ResponseStockTracking response =new ResponseStockTracking();
		double outwardQuantity=0;
		double inwardQuantity=0;
		
		List<TransactionHead> txnHead1 = transactionHeadRepository.findAllWithCreationDateTimeBefore(stockLedger.getFromDate(), stockLedger.getStoreId());
		
		for (TransactionHead txnHeadList : txnHead1) {
			if (txnHeadList.getType().equals("outward")) {
				List<TransactionDetail> txnDetailList = transactionDetailRepository
						.getTransactionfromDate(txnHeadList.getId(), stockLedger.getProductId());

				for (TransactionDetail txnDetail : txnDetailList) {
					outwardQuantity += txnDetail.getQuantity();
				}
				
			} else {
				List<TransactionDetail> txnDetailList = transactionDetailRepository
						.getTransactionfromDate(txnHeadList.getId(),stockLedger.getProductId());

				for (TransactionDetail txnDetail : txnDetailList) {
					inwardQuantity += txnDetail.getQuantity();
					
				}

			}

		}
		
	double closingQuantity=inwardQuantity-outwardQuantity;
		double balance= closingQuantity;
		System.out.println(inwardQuantity-outwardQuantity);
			inwardQuantity=0; 
			double totalInward=0;
		List<TransactionHead> txnHead2 = transactionHeadRepository.findAllWithTransactionDateBetween(stockLedger.getFromDate(), stockLedger.getToDate(),stockLedger.getStoreId());
		for (TransactionHead txnHeadList : txnHead2) {
			
				List<TransactionDetail> txnDetailList = transactionDetailRepository
						.getTransactionfromDate(txnHeadList.getId(), stockLedger.getProductId());
				for (TransactionDetail txnDetail : txnDetailList) {
					
					response = new ResponseStockTracking();
					response.setTransactionDate(txnHeadList.getTransactionDate());
					response.setUnit("PCS");
					response.setTransactionNo(txnHeadList.getId());
					response.setTranscationType(txnHeadList.getType());
					
					if(txnHeadList.getType().equals("outward")) {
						response.setOutQuantity(txnDetail.getQuantity());	
						balance-= txnDetail.getQuantity();
						outwardQuantity += txnDetail.getQuantity();
					}else {
						response.setInQuantity(txnDetail.getQuantity());
						balance+= txnDetail.getQuantity();
						inwardQuantity += txnDetail.getQuantity();
					}
					System.out.println("Inward Quantity :"+ response.getInQuantity());
					System.out.println("Outward Quantity :"+ response.getOutQuantity());
					System.out.println(closingQuantity);
					
					closingQuantity=(closingQuantity+response.getInQuantity()-response.getOutQuantity());
					System.out.println((closingQuantity+response.getInQuantity()-response.getOutQuantity()));
					response.setBalQuantity(balance);
					
					responseList.add(response);
					
				}

			} 
		
		return responseList;
	}

}
