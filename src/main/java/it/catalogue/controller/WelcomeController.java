package it.catalogue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class WelcomeController {

	@GetMapping("/")
	public String index() {
		
		return "index";
		
	}	
	
	@ResponseBody
	@GetMapping("/welcome")
	public String welcome() {
		
		return "Welcome in Catalogue";
		
	}
	
}
