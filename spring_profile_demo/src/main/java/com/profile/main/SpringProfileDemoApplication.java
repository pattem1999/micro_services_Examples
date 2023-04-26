package com.profile.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.profile.main.demo.Animal;

@SpringBootApplication
public class SpringProfileDemoApplication implements CommandLineRunner{

	@Autowired
	Animal animal;
	
	@Value("${mycompany.name}")
	String company;
	
	@Value("${mydatasource.username}")
	String username;
	public static void main(String[] args) {
		SpringApplication.run(SpringProfileDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("My company is "+company);
		System.out.println("username"+username);
		animal.makeSound();
	}

}
