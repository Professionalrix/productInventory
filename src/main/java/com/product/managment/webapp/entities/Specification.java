package com.product.managment.webapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity	
@Table(name="specification")
public class Specification {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="display")
	private String display;
	
	@Column(name="ram_size")
	private String ramSize;
	
	@Column(name="processor")
	private String processor;
	
	@Column(name="camera_size")
	private String camerasize;
	
	@Column(name="battery_size")
	private String batterySize;

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

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public String getRamSize() {
		return ramSize;
	}

	public void setRamSize(String ramSize) {
		this.ramSize = ramSize;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	
	

	public String getCamerasize() {
		return camerasize;
	}

	public void setCamerasize(String camerasize) {
		this.camerasize = camerasize;
	}

	public String getBatterySize() {
		return batterySize;
	}

	public void setBatterySize(String batterySize) {
		this.batterySize = batterySize;
	}

	public Specification() {
	
	}

	public Specification(String name, String display, String ramSize, String processor, String camerasize,
			String batterySize) {
		super();
		this.name = name;
		this.display = display;
		this.ramSize = ramSize;
		this.processor = processor;
		this.camerasize = camerasize;
		this.batterySize = batterySize;
	}

	@Override
	public String toString() {
		return "Specification [id=" + id + ", name=" + name + ", display=" + display + ", ramSize=" + ramSize
				+ ", processor=" + processor + ", camerasize=" + camerasize + ", batterySize=" + batterySize + "]";
	}
	

}
