package com.product.managment.webapp.model;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class ResponseStockTracking {
	
	@Temporal(TemporalType.DATE)
	private Date transactionDate;
	private Long transactionNo;
	private String productName;
	private Double inQuantity;
	private double outQuantity;
	private String unit;
	private double balQuantity;
	private String transcationType;
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public Long getTransactionNo() {
		return transactionNo;
	}
	public void setTransactionNo(Long transactionNo) {
		this.transactionNo = transactionNo;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public Double getInQuantity() {
		return inQuantity;
	}
	public void setInQuantity(Double inQuantity) {
		this.inQuantity = inQuantity;
	}
	public double getOutQuantity() {
		return outQuantity;
	}
	public void setOutQuantity(double outQuantity) {
		this.outQuantity = outQuantity;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public double getBalQuantity() {
		return balQuantity;
	}
	public void setBalQuantity(double balQuantity) {
		this.balQuantity = balQuantity;
	}
	public String getTranscationType() {
		return transcationType;
	}
	public void setTranscationType(String transcationType) {
		this.transcationType = transcationType;
	}
	public ResponseStockTracking() {
		
	}
	public ResponseStockTracking(Date transactionDate, Long transactionNo, String productName, 
			double outQuantity, String unit, String transcationType) {
		super();
		this.transactionDate = transactionDate;
		this.transactionNo = transactionNo;
		this.productName = productName;
		
		this.outQuantity = outQuantity;
		this.unit = unit;
		
		this.transcationType = transcationType;
	}
	
	
	
	
					

}
