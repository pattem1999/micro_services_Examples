package com.microservices.employeeapp.response;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeResponse {

	private Integer employeeId;

	private String employeeName;

	private String employeeEmail;

	private String employeeBloodGroup;
	/*
	 * private Integer employeeId1;
	 * 
	 * private String employeeName1;
	 * 
	 * private String employeeEmail1;
	 * 
	 * private String employeeBloodGroup1;
	 */
	
	private AddressResponse addressResponse;

}
