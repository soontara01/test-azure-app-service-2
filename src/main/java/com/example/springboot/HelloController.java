package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/noom")
	public String index() {
		return "Greetings from Spring Boot!xxx1";
	}
	
	@RequestMapping("/")
	String sayHello() {
			System.out.println(AAAAAAAAAAAAAASssssss");
		return "Hello World!";
	}

}
