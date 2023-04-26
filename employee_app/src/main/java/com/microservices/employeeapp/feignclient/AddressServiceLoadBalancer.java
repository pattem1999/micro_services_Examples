package com.microservices.employeeapp.feignclient;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;

import feign.Feign;

@LoadBalancerClient(name ="ADDRESS-APP",configuration = CustomLoadBalancer.class)
public class AddressServiceLoadBalancer {

	
	@LoadBalanced
	@Bean
	public Feign.Builder feiBuilder()
	{
		return Feign.builder();
	}
}
