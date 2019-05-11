package com.jspiders.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jspiders.app.DTO.StudentDTO;

@Controller
public class LoginAndRegisterController {

	@RequestMapping(value="/displaysignUpPage")
	String displaysignUpPage()
	{
		System.out.println("Details Displayed");
		
		return "signup";
	}
	
	
	
	
	@RequestMapping(value="/Signup")
	String registerStudent(StudentDTO std ,Model model)
	{
		System.out.println(std);
		model.addAttribute("std", std);
		return "displayMyDetails";
	}
}
