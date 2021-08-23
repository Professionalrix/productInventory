package com.product.managment.webapp.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="transaction_head")
public class TransactionHead {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="supp_id")
	private Long supplierId;
	
	@Column(name="store_id")
	private Long storeId;
	
	
	@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name="supp_id",insertable = false, updatable = false, nullable = true)	
	private Supplier supplier;
	
	@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name="store_id",insertable = false, updatable = false, nullable = true)
	private Store store;
	
	
	@Column(name="transaction_date")
	@Temporal(TemporalType.DATE)
	private Date transactionDate;
	
	@JsonIgnore
	@Column(name="created_date",updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate = new Date();
	
	@JsonIgnore
	@Column(name="modified_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date modifiedDate = new Date();
	
	@Column(name="type")
	private String type;
	
	@Column(name="bill_no")
	private String billNo;
	
	@Column(name="remarks")
	private String remarks;
	
	@Column(name="status")
	private Long status;
	
	@Column(name="bill_date")
	private Date billDate;
	
	@Column(name="total_taxble_amount")
	private double totalTaxableAmount;
	
	@Column(name="total_sgst")
	private double totalSgst;
	
	@Column(name="total_igst")
	private double totalIgst;
	
	@Column(name="total_cgst")
	private double totalCgst;
	
	@Column(name="grand_total")
	private double grandTotal;
	
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "transaction_head_id")
	private List<TransactionDetail> transactionDetails;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public double getTotalTaxableAmount() {
		return totalTaxableAmount;
	}

	public void setTotalTaxableAmount(double totalTaxableAmount) {
		this.totalTaxableAmount = totalTaxableAmount;
	}

	public double getTotalSgst() {
		return totalSgst;
	}

	public void setTotalSgst(double totalSgst) {
		this.totalSgst = totalSgst;
	}

	public double getTotalIgst() {
		return totalIgst;
	}

	public void setTotalIgst(double totalIgst) {
		this.totalIgst = totalIgst;
	}

	public double getTotalCgst() {
		return totalCgst;
	}

	public void setTotalCgst(double totalCgst) {
		this.totalCgst = totalCgst;
	}

	public double getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public List<TransactionDetail> getTransactionDetails() {
		return transactionDetails;
	}

	public void setTransactionDetails(List<TransactionDetail> transactionDetails) {
		this.transactionDetails = transactionDetails;
	}

	public Long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	public Long getStoreId() {
		return storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}
	
	
	
	
}
