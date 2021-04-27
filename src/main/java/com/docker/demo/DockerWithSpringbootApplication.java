package com.docker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerWithSpringbootApplication {
	
	@RequestMapping("/")
	public String hello() {
		return "hello docker app";
	}


	public static void main(String[] args) {
		SpringApplication.run(DockerWithSpringbootApplication.class, args);
	}

}
