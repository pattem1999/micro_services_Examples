package com.microservices.employeeapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservices.employeeapp.entity.Employee;
import com.microservices.employeeapp.response.EmployeeResponse;
import com.microservices.employeeapp.service.EmployeeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class EmployeeRestController {

	private final RestTemplate restTemplate;

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employee")
	public String getEmployee() {

		String address = restTemplate.getForObject("http://localhost:8080/address", String.class);
		return "Name:Ramana,Email:pattemvenkataramana886@gmail.com\n:-" + address;
	}

	@GetMapping(path = "/employees/{id}")
	public EmployeeResponse getEmployeeDetails(@PathVariable(name = "id") Integer id) {
		EmployeeResponse employeeResponse = employeeService.getEmployeeById(id);
		return employeeResponse;

	}

}
