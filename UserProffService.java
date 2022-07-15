package com.userloginregistration.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userloginregistration.entity.ProffUser;
import com.userloginregistration.entity.User;
import com.userloginregistration.repository.UserProffRepository;

@Service
public class UserProffService {
	@Autowired
	private UserProffRepository userRepository;

	public ProffUser addUser(ProffUser user) {
		return userRepository.save(user);
	}

	}
