package com.microservices.employeeapp.service;

import java.util.List;

import com.microservices.employeeapp.entity.Employee;
import com.microservices.employeeapp.response.EmployeeResponse;

public interface EmployeeService {

	EmployeeResponse getEmployeeById(Integer id);

	List<EmployeeResponse> getEmployeeAlongAddress();

	EmployeeResponse createEmployee(EmployeeResponse employeeResponse);
	
}
