package com.userloginregistration.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userloginregistration.entity.User;
import com.userloginregistration.repository.UserRepository;

@Service
public class UserService {
	
//	public User addUser(User user);
//	
//	public Optional<User> getUserByName(String name);
//	
//	public String findUser(String name);
	@Autowired
	private UserRepository userRepository;

	public User addUser(User user) {
		return userRepository.save(user);
	}


}
