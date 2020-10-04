package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserDto;
import com.example.demo.pojo.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<UserDto> findAllUsers() {
		
		
		
		
		List<User> users = userRepository.findAll();
		
		
		List<UserDto> userDtos = new ArrayList<UserDto>();
		
		if(!(users == null || users.size()==0)) {
			for(User user : users) {
				UserDto userDto = new UserDto();
				
				BeanUtils.copyProperties(user,userDto);
				
				userDtos.add(userDto);
				
			}
		}
		
		
		
		return userDtos;
		
	}

}
