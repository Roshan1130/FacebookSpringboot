package com.emailservice.springboot.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emailservice.springboot.dtos.UserDto;
import com.emailservice.springboot.entities.UserEntity;
import com.emailservice.springboot.entities.UserLoginEntity;
import com.emailservice.springboot.repositories.UserRepository;

@Service
public class UserService {
	

	@Autowired
	private UserRepository ur;
	
	private UserLoginEntity ule = new UserLoginEntity();
	
	
	public void saveUser(UserDto dto) {
		UserEntity user = new UserEntity();
		user.setName(dto.getName());
		user.setEmail(dto.getEmail());
		user.setGender(dto.getGender());
		
		// user login entity setup
		ule.setLastSignOn(new Date());
		ule.setUsername("Roshan");
		ule.setPassword("mypassword");
				
		user.setLogin(ule);
	
		ur.save(user);
		
	}
	
	
}
