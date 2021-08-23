package com.product.managment.webapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="instructor_detail")
public class InstructorDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ids")
	private int id;
	
	@OneToOne(mappedBy = "instructorDetail")
	private Instructor instructor;
	
	@Column(name="address")
	private String 	address;
	
	@Column(name="hobby")
	private String hobby;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public InstructorDetail(String address, String hobby) {
		super();
		this.address = address;
		this.hobby = hobby;
	}

	public InstructorDetail() {
	
	}


	
	

}
