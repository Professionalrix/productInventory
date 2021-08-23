package com.product.managment.webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.managment.webapp.entities.Course;
import com.product.managment.webapp.entities.Instructor;
import com.product.managment.webapp.entities.InstructorDetail;
import com.product.managment.webapp.repositories.CourseRepository;
import com.product.managment.webapp.repositories.InstructorDetailRepository;
import com.product.managment.webapp.repositories.InstructorRepository;

@RestController
public class InstructorController {

	@Autowired
	private InstructorRepository instructorRepository;
	
	@Autowired
	private InstructorDetailRepository instructorDetailRepository; 
	
	@Autowired
	private CourseRepository courseRepository;
	
	
	@PostMapping("/instructor")
	public Instructor insertInstructor(@RequestBody Instructor instructor) {
		
		return instructorRepository.save(instructor);
	}
	@GetMapping("/instructor/{id}")
	public Instructor getById(@PathVariable int id) {
		
		return instructorRepository.getById(id);
	}
	
	
	@GetMapping("/instructor")
	public Iterable<Instructor> getInstructor(){
		return instructorRepository.findAll();
	}
	
	
	@DeleteMapping("instructor/{id}")
	public void deleteInstructor(@PathVariable int id) {
		instructorRepository.deleteById(id);
	}
	
	
	@GetMapping("/instructordetail")
	public Iterable<InstructorDetail> getInstructorDetail(){
		return instructorDetailRepository.findAll();
	}
	

	@PostMapping("/instructordetail")
	public InstructorDetail insertInstructordetail(@RequestBody InstructorDetail instructorDetail) {
		
		return instructorDetailRepository.save(instructorDetail);
	}
	
	@DeleteMapping("instructordetail/{id}")
	public void deleteinstructordetail(@PathVariable int id) {
		instructorDetailRepository.deleteById(id);
	}
	
///// course Repository
	
	@GetMapping("/course")
	public Iterable<Course> getAllCourse(){
		
		return courseRepository.findAll();
	}
		
	
}
