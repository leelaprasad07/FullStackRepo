package com.nt.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Company;
import com.nt.model.Customer;

@RestController
public class CustomerOpeContr 
{
	@GetMapping("/details")
	public ResponseEntity<Customer> showDeatils1()
	{
		Customer c=new Customer(1,"Nagaraju",5678.8,
				new String[]{"red","Green","Black"},
				List.of("10","10+2","B.Tech"),
				Set.of(9836474l,9244144l,63027235l),
				Map.of("aadhar",94487,"Pano",83746),
				new Company("IPhone","hyd","Elec",60));
		HttpStatus status=HttpStatus.OK;
		
		return new ResponseEntity<Customer>(c,status);
	}
}
