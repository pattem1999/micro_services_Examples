package com.example.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.model.User;
import com.example.main.service.UserService;

@RestController
public class UserController {

	
	@Autowired
	
	UserService userService;
	@GetMapping("/user/{username}")
	List<User> getByUsername(@PathVariable("username") String username)
	{
		
		return userService.findByUserName(username);
	}
}
