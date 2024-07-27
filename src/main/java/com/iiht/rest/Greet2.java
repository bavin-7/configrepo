package com.iiht.rest;

import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/rest/api2.0")
public class Greet2 {
	
	@GetMapping
	@RequestMapping("/welcome")
	public ResponseEntity<String> message() {
		
		ResponseEntity<String> response = new ResponseEntity<>("OLA! COMMO SAVA", HttpStatus.OK);
		return response;
	}
	
	@GetMapping
	@RequestMapping("/time")
	public ResponseEntity<String> getTime() {
		
		
		
		//ResponseEntity<String> response = new ResponseEntity<>(); using static method
		return ResponseEntity.status(HttpStatus.OK).body(Calendar.getInstance().getTime()+"");
		//return Calendar.getInstance().getTime()+"";
		
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
	@RequestMapping("/namegender/{name}/{gender}")
	public ResponseEntity<String> genderMessage2(@RequestHeader HttpHeaders headers,@PathVariable String name, @PathVariable String gender){
		
		Set<String> set = headers.keySet();
		 Iterator<String> keys=set.iterator();
		String keyStr = null;
		while(keys.hasNext()) {
			
			keyStr+=keys.next()+"\n";
		}
		String keyValueStr=null;
		Set<Entry<String,List<String>>>entries=headers.entrySet();
	
		
		Iterator iter2=entries.iterator();
		
		while(iter2.hasNext()) {
			keyValueStr += iter2.next()+"<br/>";
		}
		//return keyStr;
		
		
		HttpHeaders headers2= new HttpHeaders();
		headers2.setAcceptLanguageAsLocales(null);
		headers2.setAcceptCharset((List<Charset>)Charset.defaultCharset());
		headers2.setContentType(MediaType.TEXT_HTML);
		headers2.setContentLength(keyValueStr.length());
		headers2.set("UST","Gamma Training #6");
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).headers(headers2).body(keyValueStr);
		
	//HttpHeaders headers = new HttpHeaders();
	
	}
	@PostMapping
	@RequestMapping(path="/namegender", method=RequestMethod.POST)
	
	public ResponseEntity<Member> genderMessage3(@RequestBody Member member){
		
		member.setName(member.getName()+"Hello");
		return ResponseEntity.ok(member);
		
		/*
		 * if(member.getGender().equals("Female")) return
		 * ResponseEntity.ok("Welcome Miss"+member.getName());
		 * 
		 * else if(member.getGender().equals("Male")) return
		 * ResponseEntity.ok("Welcome Mr."+member.getName());
		 * 
		 * else return ResponseEntity.ok("Welcome"+member.getName());
		 */
	
	}
}
	
	



