package com.microservicesproject.project.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservicesproject.project.model.Project;



@Repository
public interface ProjectRepository  extends JpaRepository<Project, Long>{

	Project findByProjectCode(Long employeeAssignedProject);
}

