package com.product.managment.webapp.entities;

import java.util.Date;

public class FromDate {

		private Long productId;
		private Long storeId;
		private Date date;
		private Date startDate;
		private Date endDate;
		
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
		
		public void setDate(Date date) {
			this.date = date;
		}
		public FromDate() {
			super();
			// TODO Auto-generated constructor stub
		}
		public FromDate(Long productId, Long storeId, Date date) {
			super();
			this.productId = productId;
			this.storeId = storeId;
			this.date = date;
		}
		public Date getDate() {
			return date;
		}
		public Date getStartDate() {
			return startDate;
		}
		public void setStartDate(Date startDate) {
			this.startDate = startDate;
		}
		public Date getEndDate() {
			return endDate;
		}
		public void setEndDate(Date endDate) {
			this.endDate = endDate;
		}
		public FromDate(Long productId, Long storeId, Date date, Date startDate, Date endDate) {
			super();
			this.productId = productId;
			this.storeId = storeId;
			this.date = date;
			this.startDate = startDate;
			this.endDate = endDate;
		}
		
		
		 
		
	
}
