package com.ems.main.service;

import java.util.List;

import com.ems.main.model.Employee;

public interface EmployeeService {

	public void createOrUpdateEmployee(Employee empDTO);
	
	public List<Employee> getAllEmployee();
	
	public void deleteEmployee(Long id);
	
	public Employee editEmployee(Long id);
	
}
