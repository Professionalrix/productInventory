package com.product.managment.webapp.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="transaction_detail")
public class TransactionDetail {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="id")
		private Long id;
		
		@JsonIgnore
		@Column(name="created_date",updatable = false)
		@Temporal(TemporalType.TIMESTAMP)
		private Date createDate=new Date();
		
		@JsonIgnore
		@Column(name="modified_date")
		@Temporal(TemporalType.TIMESTAMP)
		private Date modifiedDate = new Date();
		
		@Column(name="transaction_head_id")
		private Long transactionHeadId;
		
		@Column(name="prod_id")
		private Long productId;
		
		@Column(name="spec_id")
		private Long specId;
		
		@OneToOne(fetch = FetchType.EAGER)
		@JoinColumn(name="prod_id",insertable = false, updatable = false, nullable = true)
		private Product product;
		
		@OneToOne(fetch = FetchType.EAGER)
		@JoinColumn(name="spec_id",insertable = false, updatable = false, nullable = true)
		private Specification specification;
		
		@Column(name="qty")
		private double quantity;
		
		@Column(name="rate")
		private double rate;
		
		@Column(name="tax")
		private double tax;
		
		@Column(name="taxable_amount")
		private double taxableAamount;
		
		@Column(name="cgst")
		private double cgst;
		
		@Column(name="sgst")
		private double sgst;
		
		@Column(name="igst")
		private double igst;
		
		@Column(name="total_amount")
		private double totalAmount;
		
		@Column(name="status")
		private Long status;
		
		
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Date getCreateDate() {
			return createDate;
		}

		public void setCreateDate(Date createDate) {
			this.createDate = createDate;
		}

		public Date getModifiedDate() {
			return modifiedDate;
		}

		public void setModifiedDate(Date modifiedDate) {
			this.modifiedDate = modifiedDate;
		}

		public double getQuantity() {
			return quantity;
		}

		public void setQuantity(double quantity) {
			this.quantity = quantity;
		}

		public double getRate() {
			return rate;
		}

		public void setRate(double rate) {
			this.rate = rate;
		}

		public double getTax() {
			return tax;
		}

		public void setTax(double tax) {
			this.tax = tax;
		}



		public Long getTransactionHeadId() {
			return transactionHeadId;
		}

		public void setTransactionHeadId(Long transactionHeadId) {
			this.transactionHeadId = transactionHeadId;
		}

		public Long getSpecId() {
			return specId;
		}

		public void setSpecId(Long specId) {
			this.specId = specId;
		}

		public Product getProduct() {
			return product;
		}

		public void setProduct(Product product) {
			this.product = product;
		}

		public double getTaxableAamount() {
			return taxableAamount;
		}

		public void setTaxableAamount(double taxableAamount) {
			this.taxableAamount = taxableAamount;
		}

		public void setProductId(Long productId) {
			this.productId = productId;
		}

		public double getCgst() {
			return cgst;
		}

		public void setCgst(double cgst) {
			this.cgst = cgst;
		}

		public double getSgst() {
			return sgst;
		}

		public void setSgst(double sgst) {
			this.sgst = sgst;
		}

		public double getIgst() {
			return igst;
		}

		public void setIgst(double igst) {
			this.igst = igst;
		}

		public double getTotalAmount() {
			return totalAmount;
		}

		public void setTotalAmount(double totalAmount) {
			this.totalAmount = totalAmount;
		}

		public Long getStatus() {
			return status;
		}

		public void setStatus(Long status) {
			this.status = status;
		}

		public Specification getSpecification() {
			return specification;
		}

		public void setSpecification(Specification specification) {
			this.specification = specification;
		}

		public Long getProductId() {
			return productId;
		}
		
		

}
