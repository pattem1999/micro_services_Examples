package com.microservices.employeeapp.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.microservices.employeeapp.entity.Employee;
import com.microservices.employeeapp.repository.EmployeeRepository;
import com.microservices.employeeapp.response.AddressResponse;
import com.microservices.employeeapp.response.EmployeeResponse;

import ch.qos.logback.classic.Logger;

@Service
public class EmployeeServiceImp implements EmployeeService {

	private final EmployeeRepository employeeRepository;

	@Autowired
	private final ModelMapper mapper;

	public EmployeeServiceImp(EmployeeRepository employeeRepository, ModelMapper mapper) {
		super();

		// private static Logger logger = LoggerFactory.getLogger(Main.class);
		this.employeeRepository = employeeRepository;
		this.mapper = mapper;

	}

	@Override
	public EmployeeResponse getEmployeeById(Integer id) {

		Employee emp1 = employeeRepository.findById(id).get();

		EmployeeResponse employeeResponse = mapper.map(emp1, EmployeeResponse.class);

		AddressResponse addressResponse = new AddressResponse();

		addressResponse = null;
		employeeResponse.setAddressResponse(addressResponse);
		return employeeResponse;

	}

	/*
	 * private EmployeeResponse employeeToEmployeeRespone(Employee emp) { return
	 * EmployeeResponse.builder().employeeId(emp.getEmployeeId()).employeeName(emp.
	 * getEmployeeName())
	 * .employeeEmail(emp.getEmployeeEmail()).employeeBloodGroup(emp.
	 * getEmployeeBloodGroup()).build();
	 * 
	 * }
	 */
	

}
