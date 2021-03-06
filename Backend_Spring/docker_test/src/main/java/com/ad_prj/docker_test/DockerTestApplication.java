package com.ad_prj.docker_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DockerTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerTestApplication.class, args);
	}
	
	@GetMapping("/")
	public String hello() {
		return "Hello Docker Project222";
	}
}
