package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.servicesstudent.StudentServicesI;

@RestController
public class StudentController {
	@Autowired
	private StudentServicesI ss;
	
	
 @PostMapping("/student")
 public Student addStudent(@RequestBody Student student)
 {
	return ss.saveStudent(student);
	 
	 
	}
}
