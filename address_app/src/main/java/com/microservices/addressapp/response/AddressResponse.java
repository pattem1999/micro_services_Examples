package com.microservices.addressapp.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressResponse {

	private Integer addressId;
	
	private String lane1;
	private String lane2;
	
	private String state;
	
	private String zipcode;
}
