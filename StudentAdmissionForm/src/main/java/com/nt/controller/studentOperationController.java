package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Student;

//import jakarta.annotation.PostConstruct;

@Controller
public class studentOperationController 
{
	@GetMapping("/")
	public String showHomePage()
	{
		return "studentregister";
	}
//	@GetMapping("/register")
//	public String showStudentFormPage()
//	{
//		return "student_register";
//	}
	@PostMapping("/register")
	public String registerStudent(Map<String,Object> map,Student st)
	{
	 map.put("st", st);
		System.out.println(st);
			return "showresult";
	}
	
}
