package com.microservices.addressapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.addressapp.response.AddressResponse;
import com.microservices.addressapp.service.AddressService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class AddressRestController {

	@Autowired
	private AddressService addressService;
	
	@GetMapping("/address")
	public String getAddress()
	{
		return "hi marthahali,bengaluru";
	}
	
	
	
	@GetMapping(path = "/address/{employeeId}")
	public ResponseEntity<AddressResponse> getAddressByEmployeeId(@PathVariable("employeeId") Integer id)
	{
		log.info("started the API call for getting address by employee id");
		AddressResponse addressResponse=addressService.findAddressByEmployeeId(id);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(addressResponse);
		
	}
	
	@GetMapping("/address1")
	public ResponseEntity<List<AddressResponse>> getAllAddress()
	{
		List<AddressResponse> addressResponses=addressService.getAllAddress();
		 return ResponseEntity.status(HttpStatus.OK).body(addressResponses);
	}
	
	
	@PostMapping("/register-app/app")
	public AddressResponse registerAddressDetails(@RequestBody AddressResponse addressResponse)
	{
		
		return addressService.registerAddress(addressResponse);
	}

}
