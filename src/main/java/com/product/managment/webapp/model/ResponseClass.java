package com.product.managment.webapp.model;

public class ResponseClass {
private Double inwardQuantity;
private Double outwardQwantity;
private String productName;
private Long productId;
private Double openingStock;
private Double closingStock;
private String supplierName;
public ResponseClass(Double inwardQuantity, Double outwardQwantity, String productName, Double openingStock,
		Double closingStock, String supplierName) {
	super();
	this.inwardQuantity = inwardQuantity;
	this.outwardQwantity = outwardQwantity;
	this.productName = productName;
	this.openingStock = openingStock;
	this.closingStock = closingStock;
	this.supplierName = supplierName;
}
public ResponseClass() {
	super();
}
public Double getInwardQuantity() {
	return inwardQuantity;
}
public void setInwardQuantity(Double inwardQuantity) {
	this.inwardQuantity = inwardQuantity;
}
public Double getOutwardQwantity() {
	return outwardQwantity;
}
public void setOutwardQwantity(Double outwardQwantity) {
	this.outwardQwantity = outwardQwantity;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public Double getOpeningStock() {
	return openingStock;
}
public void setOpeningStock(Double openingStock) {
	this.openingStock = openingStock;
}
public Double getClosingStock() {
	return closingStock;
}
public void setClosingStock(Double closingStock) {
	this.closingStock = closingStock;
}
public String getSupplierName() {
	return supplierName;
}
public void setSupplierName(String supplierName) {
	this.supplierName = supplierName;
	
	
}
public Long getProductId() {
	return productId;
}
public void setProductId(Long productId) {
	this.productId = productId;
}


}
