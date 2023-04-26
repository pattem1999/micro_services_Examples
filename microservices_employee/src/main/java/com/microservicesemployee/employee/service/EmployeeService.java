package com.microservicesemployee.employee.service;

import com.microservicesemployee.employee.model.Employee;
import com.microservicesemployee.employee.payload.EmployeeDto;

//import com.microservices.employee.model.Employee;
//import com.microservices.employee.payload.EmployeeDto;

public interface EmployeeService {

	public EmployeeDto saveEmployee(Employee employee);
	public EmployeeDto getEmployeeById(Long id);
	
}

