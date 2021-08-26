package com.product.managment.webapp.entities;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class StockLedger {
	
	private Long productId;
	private Long storeId;
	
	@Temporal(TemporalType.DATE)
	private Date fromDate;
	@Temporal(TemporalType.DATE)
	private Date toDate;
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public Long getStoreId() {
		return storeId;
	}
	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public StockLedger() {
		
	}
	public StockLedger(Long productId, Long storeId, Date fromDate, Date toDate) {
		super();
		this.productId = productId;
		this.storeId = storeId;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}
	
	
	
	
}
