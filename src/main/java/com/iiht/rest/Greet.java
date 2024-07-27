package com.iiht.rest;

import java.util.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/rest/api1.0")
public class Greet {
	
	@GetMapping
	@RequestMapping("/welcome")
	public String message() {
		return "OLA! COMMO SAVA";
	}
	
	@GetMapping
	@RequestMapping("/time")
	public String getTime() {
		
		return Calendar.getInstance().getTime()+"";
		
	}

	@GetMapping
	@RequestMapping("/gender/{gender}")
	public String genderMessage(@PathVariable String gender){
		
		if(gender.equals("Female")) {
				return "Welcome Miss";
			
	}
		if(gender.equals("Male")) {
				return "Welcome Mr";
		}
		else
				return "Welcome";
	}
	
	@GetMapping
	@RequestMapping("/{name}/{gender}")
	public String genderMessage2(@PathVariable String name, @PathVariable String gender){
		
		if(gender.equals("Female")) {
				return "Welcome Miss "+name;
			
	}
		if(gender.equals("Male")) {
				return "Welcome Mr"+name;
		}
		else
				return "Welcome"+name;
	}
	
	
}


