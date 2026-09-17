package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nt.repository.EmployeeRepository;
import com.nt.sbeans.Employee;
@Service
public class EmployeeService implements IEmployeeService
{
	@Autowired
	private EmployeeRepository empSer;
	
	

	@Override
	public Iterable<Employee> getEmployeesByPage(int pageNumber, int pageSize) 
	{
		Pageable page=PageRequest.of(pageNumber, pageSize);
		return empSer.findAll(page);
	}

	@Override
	public Iterable<Employee> getEmployeeSortedBySal() 
	{
		Sort sort=Sort.by(Sort.Direction.ASC,"salary");
		return empSer.findAll(sort);
	}

	@Override
	public Iterable<Employee> getEmployeeSortedByName() 
	{
		Sort sort=Sort.by(Sort.Direction.ASC,"employeeName");
		return empSer.findAll(sort);
	}

	@Override
	public void save(Employee employee) 
	{
		empSer.save(employee);
	}
}
