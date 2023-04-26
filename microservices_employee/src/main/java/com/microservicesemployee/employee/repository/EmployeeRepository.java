package com.microservicesemployee.employee.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservicesemployee.employee.model.Employee;

//import com.microservices.employee.model.Employee;



@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Long>{

}

