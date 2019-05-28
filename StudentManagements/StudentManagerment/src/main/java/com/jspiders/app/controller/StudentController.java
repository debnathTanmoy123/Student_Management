package com.jspiders.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jspiders.app.dto.StudentDto;

@Controller
public class StudentController {

	@RequestMapping(value = "/")
	String dashboard(){
	return "signInUp";	
	}
	
	@RequestMapping("/update")
	String updateStudent(){
		System.out.println("update");
	return "dashboard";	
	}
	
	@RequestMapping(value = "/delete")
	String deleteStudent(){
		System.out.println("delete");
	return "dashboard";	
	}
	
	@RequestMapping(value = "/dummyStudent")
	String dummyStudent(StudentDto student){
		System.out.println(student);
	return "dummtSudentDetails";	
	}
	
}
