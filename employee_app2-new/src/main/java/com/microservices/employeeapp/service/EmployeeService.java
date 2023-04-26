package com.microservices.employeeapp.service;

import com.microservices.employeeapp.entity.Employee;
import com.microservices.employeeapp.response.EmployeeResponse;

public interface EmployeeService {

	EmployeeResponse getEmployeeById(Integer id);
}
