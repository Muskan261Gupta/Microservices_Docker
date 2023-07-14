package com.nagarro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.entity.UserDetails;
import com.nagarro.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public UserDetails saveUser(UserDetails user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	public UserDetails getUserById(Long userId) {
		// TODO Auto-generated method stub
		return userRepository.findByUserId(userId);
	}

	public String deleteUserById(Long userId) {
		// TODO Auto-generated method stub
		userRepository.deleteById(userId);
		return ("User deleted with id ->"+userId);
	}
	
	
}
