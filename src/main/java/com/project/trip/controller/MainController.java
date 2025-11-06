package com.project.trip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.Getter;

@Controller
public class MainController {

	@GetMapping("/")
	public String test() {
		
		return "test";
		
	}
	
}
