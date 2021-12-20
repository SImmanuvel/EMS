package com.ems.main.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ems.main.model.Employee;
import com.ems.main.repository.EmployeeRepository;
import com.ems.main.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public void createOrUpdateEmployee(Employee empDto) {
		Employee emp = empDto;
		employeeRepository.save(emp);
	}
	
	public List<Employee> getAllEmployee() {
		List<Employee> list = employeeRepository.findAll();

		return list;
	}
	
	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
	}
	
	public Employee editEmployee(Long id) {
		Employee emp = employeeRepository.getOne(id);
		return emp;
	}
}
