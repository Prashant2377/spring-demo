package com.example.servicesstudent;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dao.AddresDao;
import com.example.model.Student;

public class StudentServices implements StudentServicesI{
 
	@Autowired
	private AddresDao ad;
	@Override
	public Student saveStudent(Student student) {

	    System.out.println("Data is saving");
	    return ad.save(student);
		
	}

}
