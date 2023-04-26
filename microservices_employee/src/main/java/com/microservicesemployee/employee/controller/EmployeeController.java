package com.microservicesemployee.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicesemployee.employee.model.Employee;
import com.microservicesemployee.employee.payload.EmployeeDto;
import com.microservicesemployee.employee.service.EmployeeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/employee")
@RequiredArgsConstructor
public class EmployeeController {
	
	@Autowired
	private final EmployeeService employeeService;
	

	@PostMapping
	public EmployeeDto createEmployee(@RequestBody Employee employee)
	{
		return employeeService.saveEmployee(employee);
		
	}
	
	@GetMapping("/{employee_id}")
	public EmployeeDto getEmployeeBy(@PathVariable Long employee_id)
	{
		
		return employeeService.getEmployeeById(employee_id);
	}
}

