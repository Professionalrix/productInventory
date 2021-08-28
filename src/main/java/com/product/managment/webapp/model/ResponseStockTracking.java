package com.product.managment.webapp.model;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class ResponseStockTracking {
	
	@Temporal(TemporalType.DATE)
	private Date transactionDate;
	private Long transactionNo;
	
	private double inQuantity;
	private double outQuantity;
	private String unit;
	private double balQuantity;
	private String transcationType;
	private double totalInQuantity;
	private double totalOutQuantity;
	private double totalBalQuantity;
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
	public void setInQuantity(double inQuantity) {
		this.inQuantity = inQuantity;
	}
	public double getTotalInQuantity() {
		return totalInQuantity;
	}
	public void setTotalInQuantity(double totalInQuantity) {
		this.totalInQuantity = totalInQuantity;
	}
	public double getTotalOutQuantity() {
		return totalOutQuantity;
	}
	public void setTotalOutQuantity(double totalOutQuantity) {
		this.totalOutQuantity = totalOutQuantity;
	}
	public double getTotalBalQuantity() {
		return totalBalQuantity;
	}
	public void setTotalBalQuantity(double totalBalQuantity) {
		this.totalBalQuantity = totalBalQuantity;
	}
	
				

}
