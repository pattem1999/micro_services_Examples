package com.profile.main.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.profile.main.demo.MyDataSource;

@Configuration
@PropertySource("classpath:mydatasource1.properties")
public class DataSourceConfig {

	
	@Bean
	MyDataSource getMyDataSource(@Value("${mydatasource.username}") String username,@Value("${mydatasource.password}") String password)
	{
		MyDataSource dataSource=new MyDataSource(username,password);
		
		System.out.println(dataSource.getUsername()+"   "+dataSource.getPassword());
		return dataSource;
		
	}
}
