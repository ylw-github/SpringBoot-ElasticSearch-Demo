package com.ylw.springboot.es.repository;

import org.springframework.data.repository.CrudRepository;

import com.ylw.springboot.es.entity.UserEntity;

public interface UserReposiory extends CrudRepository<UserEntity, String> {

}
