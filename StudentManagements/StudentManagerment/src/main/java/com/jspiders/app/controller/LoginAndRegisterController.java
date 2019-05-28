package com.jspiders.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jspiders.app.dto.StudentDto;

@Controller
public class LoginAndRegisterController {

	// this will dispaly page
	@RequestMapping("/dispalySignUpPage")
	String displayRegisterStudent() {
		System.out.println("page diplayed");
	return "signUpPage";
	}
	
	// it will recive values
	@RequestMapping("/signUp")
	String registerStudent(StudentDto std , Model model) {
		System.out.println(std);
		model.addAttribute("std", std);
	return "diplayMyDetails";
	}
		
}