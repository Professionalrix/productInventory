package com.product.managment.webapp.controllers;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.managment.webapp.entities.FromDate;
import com.product.managment.webapp.entities.ResponseFromDate;
import com.product.managment.webapp.entities.Stock;
import com.product.managment.webapp.entities.TransactionDetail;
import com.product.managment.webapp.entities.TransactionHead;
import com.product.managment.webapp.repositories.TransactionHeadRepository;
import com.product.managment.webapp.services.StockService;
import com.product.managment.webapp.services.TransactionHeadService;

@RestController
@RequestMapping("/transactionhead")
@EnableTransactionManagement
public class TransactionHeadController {

	@Autowired
	private TransactionHeadService transactionHeadService;

	@Autowired
	private StockService stockService;
	
	

	/* create transactionHead */

	@PostMapping("")
	public TransactionHead insert(@RequestBody TransactionHead transactionHead) {

		Long storedId = transactionHead.getStoreId();

		if (storedId != null) {
			List<TransactionDetail> tranDetail = transactionHead.getTransactionDetails();

			/* inward transaction */
			
			if (transactionHead.getType().equals("inward")) {
				for (TransactionDetail txn : tranDetail) {

					if (txn.getQuantity() > 0) {
						if (txn.getProductId() != null) {
							System.out.println(txn.getSpecId());
							Stock getStock = stockService.findByStoreIdAndProductId(storedId, txn.getProductId(),
									txn.getSpecId());
							if (getStock != null) {
								double currentQuantity = txn.getQuantity() + getStock.getQuantity();
								getStock.setQuantity(currentQuantity);
								getStock.setRate(txn.getTotalAmount()/txn.getQuantity());
								// getStock.setId();
								
								double averageAmount= (getStock.getRate()*getStock.getQuantity()+txn.getRate()*txn.getQuantity())/getStock.getQuantity()+txn.getQuantity();
								getStock.setRate(averageAmount);
								
								this.stockService.saveStock(getStock);
							} else {
								Stock stock = new Stock();
								stock.setQuantity(txn.getQuantity());
								stock.setStoreId(transactionHead.getStoreId());
								stock.setProductId(txn.getProductId());
								stock.setSpecifictionId(txn.getSpecId());
								stock.setRate(txn.getRate());
								
								
								stockService.saveStock(stock);
							}

						}
					}
				}
					
				/* outward transaction */
				
			} else if (transactionHead.getType().equals("outward")) {

				for (TransactionDetail txn : tranDetail) {

					if (txn.getProductId() != null) {
						Stock getStock = stockService.findByStoreIdAndProductId(storedId, txn.getProductId(),
								txn.getSpecId());

						if (txn.getQuantity() > 0 && getStock.getQuantity() > txn.getQuantity()) {

							if (getStock != null) {
								double currentQuantity = getStock.getQuantity()-txn.getQuantity() ;
								getStock.setQuantity(currentQuantity);
								
								
								// getStock.setId();
								this.stockService.saveStock(getStock);
							}

						}

					}

				}
			}
		
			

		}
		return transactionHeadService.insert(transactionHead);
	}

	/* get all transactionhead */

	@GetMapping("")
	public Iterable<TransactionHead> getAllTransactionHead() {
		return transactionHeadService.getAllTransaction();
	}

	/* get by Id */

	@GetMapping("/{id}")
	public TransactionHead getTransactionById(@PathVariable Long id) {
		return transactionHeadService.getFindById(id);
	}

	/* update transactionhead */

	@PutMapping("/")
	public void updateTransactionHeadById(@RequestBody TransactionHead transactionHead) {
		transactionHeadService.insert(transactionHead);
	}

	/* delete transaction head */

	@DeleteMapping("/{id}")
	public void deleteTransactionHead(@PathVariable Long id) {
		transactionHeadService.deleteTransaction(id);

	}
	
	@PostMapping("/fromdate")
		public ResponseFromDate fromDate(@RequestBody FromDate fromDate  ) throws ParseException {
		//	List<TransactionHead> result= transactionHeadRepository.findAllWithCreationDateTimeBefore(new SimpleDateFormat("yyyy-MM-dd").parse("2021-07-11"));
			//System.out.println(result);
			/*
			 * for(TransactionHead rst : result) { System.out.println(rst.getId());
			 * 
			 * }
			 */
			
			
			
			return transactionHeadService.formDate(fromDate.getProductId(), fromDate.getStoreId(), fromDate.getDate());
			
		}
	
	@PostMapping("/betweendate")
	public void betweenDate(@RequestBody FromDate fromDate  ) throws ParseException {
		
	transactionHeadService.betweenDate(fromDate.getProductId(), fromDate.getStoreId(), fromDate.getStartDate(),fromDate.getEndDate());
		
	}
	
	
}
