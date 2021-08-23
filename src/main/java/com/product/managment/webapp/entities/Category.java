package com.product.managment.webapp.entities;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

@Entity
@Table(name="category")
public class Category {
	
	
		@Id
		@Column(name="category_id")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	 	private Long id;
		@Column(name="name")
	 	private String name;
		
		@Column(name="time")
		private LocalDateTime time;
		
				
		@Column(name ="description")
	 	private String description;
		@Column(name="status")	
	 	private Long status;
		
		@OneToOne
		@JoinColumn(name="parent_id")
		private Category parent;
		
		@OneToMany(mappedBy = "parent",cascade = CascadeType.ALL )
		private Set<Category> children = new HashSet<>();

		@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
		@JoinColumn(name="category_id")
		private List<Product> products;
		
		
		public List<Product> getProducts() {
			return products;
		}
		public void setProducts(List<Product> products) {
			this.products = products;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public Long getStatus() {
			return status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
		public Category getParent() {
			return parent;
		}
		public void setParent(Category parent) {
			this.parent = parent;
		}
		public Set<Category> getChildren() {
			return children;
		}
		public void setChildren(Set<Category> children) {
			this.children = children;
		}
		public LocalDateTime getTime() {
			return time;
		}
		public void setTime(LocalDateTime time) {
			this.time = time;
		}
		public Category() {
			
		}
}
