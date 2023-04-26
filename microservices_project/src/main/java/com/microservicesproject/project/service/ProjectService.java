package com.microservicesproject.project.service;

import com.microservicesproject.project.model.Project;

//import com.microservices.project.model.Project;

public interface ProjectService {

	public Project saveProject(Project project);
	public Project getProjectByCode(Long projectCode);
}
