package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;

@RestController
public class MyRestController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value = "findAllUsers")
    public List<UserDto> findAllUsers(){
        return userService.findAllUsers();
    }
}
