package com.nt.service;

import com.nt.sbeans.Employee;

public interface IEmployeeService 
{ 
	void save(Employee employee);
	Iterable<Employee>getEmployeesByPage(int pageNumber,int pageSize);
	Iterable<Employee>getEmployeeSortedBySal();
	Iterable<Employee>getEmployeeSortedByName();

	
}
