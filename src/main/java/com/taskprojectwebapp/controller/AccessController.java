package com.taskprojectwebapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccessController {
	
	@GetMapping(path="/")
	public String index() {
		return "welcome to portal";
	}

}
