package com.jspiders.app.service;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.app.DAO.StudentDAO;
import com.jspiders.app.dto.StudentDto;

@Service
public class StudentService {

	@Autowired
	 private StudentDAO dao;
	
	public Serializable saveStudent(StudentDto studentDto)
	{
		return dao.saveStudent(studentDto);
	}
	
}
