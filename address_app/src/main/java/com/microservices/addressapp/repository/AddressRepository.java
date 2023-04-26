package com.microservices.addressapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.microservices.addressapp.entity.Address;
import com.microservices.addressapp.response.AddressResponse;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

	
	//@Query(nativeQuery = true,value = "select * from address10 ad,employee10 e where ad.employee_id=e.id and e.id=:eid1")
	//id, lane1,  lane2, state, zipcode, employee_id, lane2
	@Query(nativeQuery = true,    value="SELECT ea.id,ea.lane1,ea.lane2, ea.state,ea.zipcode FROM microservices.address10 ea"
			+ " join microservices.employee10 e on e.id=ea.employee_id where ea.employee_id=:eid1")
	Address findByAddressByEmployeeId(@Param("eid1") Integer eid);
}
