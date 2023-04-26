package com.microservicesemployee.employee.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "http://localhost:8080",value = "project-feign-client",path = "/api/project")
public interface ProjectFeign
{

	@GetMapping("/{project_code}")
	feign.Response getProjectByCode(@PathVariable("project_code") Long project_code);
	
}
