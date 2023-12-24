package com.myapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class MyapplicationApplication {
	@GetMapping("/")
	public String getData() {
		return "My name isHimanshu Saini";
	}

	public static void main(String[] args) {
		SpringApplication.run(MyapplicationApplication.class, args);
	}

}
