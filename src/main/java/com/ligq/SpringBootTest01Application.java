package com.ligq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootTest01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTest01Application.class, args);
	}
	
	@RequestMapping("/test")
	public Object test() {
		
		return "hello test";
	}
}
