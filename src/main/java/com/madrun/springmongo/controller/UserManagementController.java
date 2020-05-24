package com.madrun.springmongo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.madrun.springmongo.model.Follower;
import com.madrun.springmongo.model.User;
import com.madrun.springmongo.repository.UserRepository;

@RestController
@RequestMapping("/user-creation-service")
public class UserManagementController {
	@Autowired
	private UserRepository userRepository;

	@PostMapping("/createUser")
	public User createUser(@RequestBody User user) {
		userRepository.save(user);
		return user;
	}
	
	

	@GetMapping("/getUserById/{id}")
	public Optional<User> getUserById(@PathVariable int id) {
		return userRepository.findById(id);
	}
	
	@GetMapping("/getUserByInterest/{interest}")
	public List<User> getUserByInterest(@PathVariable String interest) {
		return userRepository.findByInterest(interest);
	}
}
