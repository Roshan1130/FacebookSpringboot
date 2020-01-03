package com.emailservice.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.emailservice.springboot.dtos.UserDto;
import com.emailservice.springboot.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService us;
	
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public void saveClient(@RequestBody UserDto dto) {
		us.saveUser(dto);
	}
}
