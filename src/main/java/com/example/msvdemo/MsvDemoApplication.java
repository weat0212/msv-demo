package com.example.msvdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(value = "hello")
public class MsvDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(MsvDemoApplication.class, args);
	}

	@RequestMapping(value = "/{firstName}/{lastName}", method = RequestMethod.GET)
	public String hello(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName) {
		return String.format("{\"message\":\"Hello %s %s\"}", firstName, lastName);
	}
}