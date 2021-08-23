package com.product.managment.webapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Review {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		 private int id;
		 private String comment;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getComment() {
			return comment;
		}
		public void setComment(String comment) {
			this.comment = comment;
		}
		public Review(String comment) {
			super();
			this.comment = comment;
		}
		 
		 

}
