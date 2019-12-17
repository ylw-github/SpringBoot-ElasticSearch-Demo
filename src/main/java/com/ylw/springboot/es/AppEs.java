package com.ylw.springboot.es;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories(basePackages = "com.ylw.springboot.es.repository")
public class AppEs {

	public static void main(String[] args) {
		SpringApplication.run(AppEs.class, args);
	}
}
