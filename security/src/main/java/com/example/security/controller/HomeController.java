package com.example.security.controller;


import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping(value="/")
	public String home() throws Exception {
		return "home";
	}

	@GetMapping(value = "/whoami")
	public String whoami(Authentication authentication) {
		System.out.println(authentication.getDetails() + " " +
				authentication.getName() + " " +
				authentication.getPrincipal() + " " +
				authentication.getAuthorities());

		return "home";
	}
}