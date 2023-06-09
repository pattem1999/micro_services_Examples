package com.example.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.main.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	List<User> findByName(String username);

}
