package com.shopme.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
		
	@GetMapping(value="/admin")
	public String viewHomePage() {
		return "Hello";
	}

}
