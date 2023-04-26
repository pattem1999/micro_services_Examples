package com.microservicesemployee.employee.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "employee",uniqueConstraints = {@UniqueConstraint(columnNames = {"employeeEmail"})})
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String employeeName;
	@Column(nullable = false)
	private Long employeeAssignedProject;
	@Column(nullable = false)
	private String employeeBaseLocation;
	@Column(nullable = false)
	private String 	employeeEmail;
	
}

