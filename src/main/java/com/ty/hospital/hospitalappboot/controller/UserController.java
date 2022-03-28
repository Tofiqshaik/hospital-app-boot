package com.ty.hospital.hospitalappboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.hospital.hospitalappboot.dao.UserDao;
import com.ty.hospital.hospitalappboot.dto.User;
import com.ty.hospital.hospitalappboot.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/user")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	@PutMapping("/user")
	public User updateUser(@RequestBody User user,@RequestParam int id) {
		return userService.UpdateUserById(user, id);
	}
	@GetMapping("/user")
	public User getUserById(@RequestParam int id) {
		return userService.getUserById(id);
	}
	@GetMapping("/alluser")
	public List<User> getAllUser(){
		return userService.getAllUser();
	}
	@DeleteMapping("/user")
	public void deleteUserById(@RequestParam int id) {
		userService.deleteUserById(id);
	}
	@PostMapping("/user/login")
	public User validateUser(@RequestBody User user) {
		return userService.validateUser(user);
	}

}
