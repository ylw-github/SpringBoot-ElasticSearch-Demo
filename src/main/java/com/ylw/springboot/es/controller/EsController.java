package com.ylw.springboot.es.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ylw.springboot.es.entity.UserEntity;
import com.ylw.springboot.es.repository.UserReposiory;

@RestController
public class EsController {

	@Autowired
	private UserReposiory userReposiory;

	@RequestMapping("/addUser")
	public UserEntity addUser(@RequestBody UserEntity user) {
		return userReposiory.save(user);
	}

	@RequestMapping("/findUser")
	public Optional<UserEntity> findUser(String id) {
		return userReposiory.findById(id);
	}

}
