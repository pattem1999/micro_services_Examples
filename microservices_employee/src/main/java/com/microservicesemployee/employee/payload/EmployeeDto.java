package com.microservicesemployee.employee.payload;

import lombok.Builder;

@Builder
public record EmployeeDto(Long id,String employeeName,
		
		String employeeBaseLocation,
		String employeeEmail,
		Long projectCode,
		String projectName) {

}

