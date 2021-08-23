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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.sun.istack.NotNull;	

@Entity
@Table(name="product")
public class Product {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column(name="product_name")
		private String productName;
		
		@Column(name="product_buying_price")
		private double productbuyingPrice;
		
		@Column(name="product_selling_price")
		private double productsellingPrice;
		
		
		@Column(name="description")
		private String description;
		
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name="date")
		private Date date;
		
		@Column(name="hsncode")
		private String hsnCode;
		
		@Column(name ="img_url")
		private String imgUrl;
		
		@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
		@JoinColumn(name="product_id")
		private List<Specification> specification;

		@Column(name="category_id")
		@NotNull
		private Long categoryId;
		
		public Long getCategoryId() {
			return categoryId;
		}

		public void setCategoryId(Long categoryId) {
			this.categoryId = categoryId;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public double getProductbuyingPrice() {
			return productbuyingPrice;
		}

		public void setProductbuyingPrice(double productbuyingPrice) {
			this.productbuyingPrice = productbuyingPrice;
		}

		public double getProductsellingPrice() {
			return productsellingPrice;
		}

		public void setProductsellingPrice(double productsellingPrice) {
			this.productsellingPrice = productsellingPrice;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public String getHsnCode() {
			return hsnCode;
		}

		public void setHsnCode(String hsnCode) {
			this.hsnCode = hsnCode;
		}

		public String getImgUrl() {
			return imgUrl;
		}

		public void setImgUrl(String imgUrl) {
			this.imgUrl = imgUrl;
		}

		public List<Specification> getSpecification() {
			return specification;
		}

		public void setSpecification(List<Specification> specification) {
			this.specification = specification;
		}

		public Product(String productName, double productbuyingPrice, double productsellingPrice, String description,
				Date date, String hsnCode, String imgUrl) {
			super();
			this.productName = productName;
			this.productbuyingPrice = productbuyingPrice;
			this.productsellingPrice = productsellingPrice;
			this.description = description;
			this.date = date;
			this.hsnCode = hsnCode;
			this.imgUrl = imgUrl;
		}

		public Product() {
		
		}

		@Override
		public String toString() {
			return "Product [id=" + id + ", productName=" + productName + ", productbuyingPrice=" + productbuyingPrice
					+ ", productsellingPrice=" + productsellingPrice + ", description=" + description + ", date=" + date
					+ ", hsnCode=" + hsnCode + ", imgUrl=" + imgUrl + ", specification=" + specification + "]";
		}
	
		

		

}
