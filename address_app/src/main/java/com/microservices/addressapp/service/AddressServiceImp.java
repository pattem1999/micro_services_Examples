package com.microservices.addressapp.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.addressapp.entity.Address;
import com.microservices.addressapp.repository.AddressRepository;
import com.microservices.addressapp.response.AddressResponse;

@Service
public class AddressServiceImp implements AddressService {

	
	@Autowired
	private AddressRepository addressRepository;

	@Autowired
	
	private ModelMapper mapper;
	@Override
	public AddressResponse findAddressByEmployeeId(Integer id) {
		// TODO Auto-generated method stub
		
		mapper=new ModelMapper();
		Address address= addressRepository.findByAddressByEmployeeId(id);
		
		AddressResponse addressResponse=mapper.map(address, AddressResponse.class);
		return addressResponse;
	}
	@Override
	public List<AddressResponse> getAllAddress() {
		// TODO Auto-generated method stub
		
		mapper=new ModelMapper();
		
		List<Address> address=addressRepository.findAll();
		return address.stream().map((address1) -> mapper.map(address1, AddressResponse.class)).collect(Collectors.toList());
	}
	@Override
	public AddressResponse registerAddress(AddressResponse addressResponse) {
		// TODO Auto-generated method stub
		
		Address address=AddressResponseToAddress(addressResponse);
		addressRepository.save(address);
		addressResponse=AddressToAddressResponse(address);
		return  addressResponse;
	}
	private AddressResponse AddressToAddressResponse(Address address) {
		// TODO Auto-generated method stub
		return AddressResponse.builder()
				.addressId(address.getAddressId())
				.lane1(address.getLane1())
				.lane2(address.getLane2())
				.state(address.getState())
				.zipcode(address.getZipcode())
				.build();
	}
	private Address AddressResponseToAddress(AddressResponse addressResponse) {
		// TODO Auto-generated method stub
		return Address.builder()
				.addressId(addressResponse.getAddressId())
				.lane1(addressResponse.getLane1())
				.lane2(addressResponse.getLane2())
				.state(addressResponse.getState())
				.zipcode(addressResponse.getZipcode())
				.build();
	}
	
}
