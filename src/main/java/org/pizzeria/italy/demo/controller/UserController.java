package org.pizzeria.italy.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {
	@GetMapping("/user")
public String getUser() {
		
		return "user";
	}
	
	@GetMapping("/admin")
	public String getAdmin() {
		
		return "admin";
	}
	
	@GetMapping("/useradmin")
	public String getUserAdmin() {
		
		return "useradmin";
	}
}
