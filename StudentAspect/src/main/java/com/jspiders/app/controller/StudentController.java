package com.jspiders.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jspiders.app.DTO.StudentDTO;

@Controller
public class StudentController {
	
	@RequestMapping(value="/")
	String signInUp()
	{
		return "signInUp";
	}
	
	
	/*
	@RequestMapping(value="/login")
	String login()
	{
	System.out.println("update");	
		return "login";
	}
	
	@RequestMapping(value="/signup")
	String signup()
	{
		System.out.println("delete");
		return "signup";
	}
	*/
	/*
		@RequestMapping(value="/")
		String dashboard()
		{
			
			return "dashboard";
		}
		*/
	

	
	
	
	
	
		/*@RequestMapping(value="/update")
		String update()
		{
		System.out.println("update");	
			return "dashboard";
		}
		
		@RequestMapping(value="/delete")
		String delete()
		{
			System.out.println("delete");
			return "dashboard";
		}*/
		
		@RequestMapping(value="/dummystudent")
		String dummyStudent(StudentDTO student)
		{
			System.out.println(student);
			return "dummystudentdetails";
		}
		
		
		
}
