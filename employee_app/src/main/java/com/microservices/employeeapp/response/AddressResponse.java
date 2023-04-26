package com.microservices.employeeapp.response;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Component
public class AddressResponse {

	private Integer addressId;
	
	private String lane1;
	private String lane2;
	
	private String state;
	
	private String zipcode;
}
