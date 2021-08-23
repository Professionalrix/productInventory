package com.product.managment.webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.managment.webapp.entities.TransactionDetail;
import com.product.managment.webapp.services.TransactionDetailService;

@RestController
@RequestMapping("/transactiondetail")
public class TransctionDetailController {

	@Autowired
	private TransactionDetailService transactionDetailService;

	/* create transaction detail	 */

	@PostMapping("")
	public TransactionDetail insert(@RequestBody TransactionDetail transactionDetail) {

		return transactionDetailService.saveTransaction(transactionDetail);

	}

	/* get all transaction detail */

	@GetMapping("")
	public Iterable<TransactionDetail> getAllTransactionHead() {
		return transactionDetailService.getTranscation();
	}

	/* get by Id */

	@GetMapping("/{id}")
	public TransactionDetail getTransactionById(@PathVariable Long id) {
		return transactionDetailService.findById(id);
	}

	/* update transaction detail */

	@PutMapping("/{id}")
	public void updateTransactionById(@RequestBody TransactionDetail transactionDetail, @PathVariable Long id) {
		TransactionDetail transactionDetailTemp = transactionDetailService.findById(id);
		if (transactionDetailTemp != null) {

			transactionDetailService.saveTransaction(transactionDetail);
		}

	}

}
