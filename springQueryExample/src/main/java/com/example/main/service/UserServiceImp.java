package com.example.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.model.User;
import com.example.main.repository.UserRepository;

@Service
public class UserServiceImp implements UserService {

	
	@Autowired
	UserRepository userRepository;
	@Override
	public List<User> findByUserName(String username) {
		// TODO Auto-generated method stub
		return userRepository.findByName(username);
	}

}
