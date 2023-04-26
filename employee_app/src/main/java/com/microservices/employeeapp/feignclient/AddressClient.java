package com.microservices.employeeapp.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.microservices.employeeapp.response.AddressResponse;

@FeignClient(name ="ADDRESS-APP",path = "/address_app/api/")
public interface AddressClient {

	
	@GetMapping("/address/{id}")
	AddressResponse getAddressByEmployeeId(@PathVariable("id") Integer id) ;
	
	@PostMapping("/register-app/app")
	AddressResponse registerAddress(@RequestBody AddressResponse addressResponse);
}
