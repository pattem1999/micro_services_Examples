package com.microservicesemployee.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicesemployee.employee.feignclient.ProjectFeign;
import com.microservicesemployee.employee.model.Employee;
import com.microservicesemployee.employee.payload.EmployeeDto;
import com.microservicesemployee.employee.repository.EmployeeRepository;

import feign.Response;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private final EmployeeRepository employeeRepository;

	@Autowired
	private final ProjectFeign projectFeign;

	@Override
	public EmployeeDto saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Employee savedEmployee = employeeRepository.save(employee);
		Response project = projectFeign.getProjectByCode(savedEmployee.getEmployeeAssignedProject());
		System.out.println(project.body().toString());
		return EmployeeDto.builder().id(savedEmployee.getId()).employeeName(savedEmployee.getEmployeeName())
				.employeeBaseLocation(savedEmployee.getEmployeeBaseLocation())
				.employeeEmail(savedEmployee.getEmployeeEmail()).build();
	}

	@Override
	public EmployeeDto getEmployeeById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
