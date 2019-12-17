package com.ylw.springboot.es.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.Data;

@Document(indexName = "user_dao", type = "user")
@Data
public class UserEntity {
	@Id
	private String id;
	private String name;
	private int sex;
	private int age;
}
