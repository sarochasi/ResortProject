package com.personalproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.personalproject.repositories.UserRepository;
import com.personalproject.resort.entities.User;

public class AuthServiceImpl implements AuthService{
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private PasswordEncoder encoder;
	
	@Override
	public User register(User user) {
		//encode pw, set enabled, etc
//		user.setPassword(encoder.encode(user.getPassword()));
//		user.setEnabled(true);
		
		userRepo.saveAndFlush(user);
		return user;
	}

}
