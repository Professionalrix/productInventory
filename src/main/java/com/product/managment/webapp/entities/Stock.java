package com.product.managment.webapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "stock")
public class Stock {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	
	@Column(name = "quantity")
	private Double quantity;

	@Column(name = "rate")
	private double rate;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "prod_id", insertable = false, updatable = false, nullable = true)
	private Product product;
	
	@Column(name="prod_id")
	private Long productId;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "store_id", insertable = false, updatable = false, nullable = true)
	private Store store;
	
	@Column(name="store_id")
	private Long storeId;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "spec_id",insertable = false,updatable = false,nullable = true)
	private Specification specId;
	
	@Column(name="spec_id")
	private Long SpecifictionId;

	public Long getSpecifictionId() {
		return SpecifictionId;
	}

	public void setSpecifictionId(Long specifictionId) {
		SpecifictionId = specifictionId;
	}

	@Column(name = "status")
	private Long status;

	public Stock() {
		super();
	}

	public Stock(Long id, Double quantity, double rate, Long productId, Long storeId, Specification specId,
			Long status) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.rate = rate;
		this.productId = productId;
		this.storeId = storeId;
		this.specId = specId;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public Long getStoreId() {
		return storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	public Specification getSpecId() {
		return specId;
	}

	public void setSpecId(Specification specId) {
		this.specId = specId;
	}
	

}
