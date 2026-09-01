package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/hospital")
//public class HospitalMang 
//{
//	@GetMapping("/welcome")
//	public String display(@PathVariable String name)
//	{
//		return "Welcome to Spring Boot Rest API  ";
//	}
	
//	@GetMapping("/welcome/{name}")
//	public String display(@PathVariable String name)
//	{
//		IO.println("Student API Working Successfully");
//		return "Welcome to Spring Boot Rest API  :"+name;
//	}
//	@GetMapping("/leela/{name},{dept}")
//	public String showDetails(@PathVariable String name,@PathVariable String dept)
//	{
//	
//		return " Employee Management System\n"
//				+ "\nEmployee Name  :  "+name+""
//			    + "\n Employee Department :  "+dept;
//	}
//	
	
//	@GetMapping("/")
//	public String showDeatils()
//	{
//		return" Welcome to City Hospital";
//	}
//	@GetMapping("/{name}")
//	public String doctorDet(@PathVariable String name)
//	{
//		return "Doctor Available : "+name;
//	}
//	@GetMapping("/emergency")
//	public String emgDetails()
//	
//	{
//		return "Emergency Services Available 24/7";
//	}
	
//}

@RestController
@RequestMapping("/hospital")
public class BankController
{
	@GetMapping("/")
	public String bankDetails()
	{
		return "Welcome to ABC BANK";
	}
	@GetMapping("/{balance}")
	public String checkBal(@PathVariable String balance)
	{
		return "Your Balance is : "+balance;
	}
	@GetMapping("/loan")
	public String loanDeatils()
	{
		return "Personal Loan Service Available";
	}
}

