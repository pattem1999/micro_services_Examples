package com.microservices.employeeapp.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class EmployeeConfig {

	@Value("${addresservice.base.url}")
	private String addressBasedUrl;

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}

	/*
	 * @Bean public WebClient getWebClient() { return
	 * WebClient.builder().baseUrl(addressBasedUrl).build(); }
	 */
}
