package com.example.main.service;

import java.util.List;

import com.example.main.model.User;

public interface UserService {

	List<User> findByUserName(String username);

}
