package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class value {
	@Value("${value}")
	private String name;
	@GetMapping("/value")
	public String display()
	{
		return "Welcome to this "+name;
	}

}
