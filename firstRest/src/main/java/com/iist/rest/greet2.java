package com.iist.rest;


import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
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
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/api2.0")
public class greet2 {
	
	@GetMapping
	@RequestMapping("/greet")
	public ResponseEntity<String> message() {
		ResponseEntity <String> response = new ResponseEntity<>("Hai , everything good?", HttpStatus.OK);
		return response;
	}
	@GetMapping
	@RequestMapping("/time")
	public ResponseEntity<String> getTime() {
		
		//ResponseEntity<String> response = new ResponseEntity<>(HTTPStatus.OK)
		return ResponseEntity.status(HttpStatus.OK).body(Calendar.getInstance().getTime()+" ");
		
		}
	@GetMapping
	@RequestMapping(("/namegender/{name}/{gender}"))
	public ResponseEntity<String> gendermessage(@RequestHeader HttpHeaders headers,@PathVariable String name, @PathVariable String gender) {
	Set<String> set = headers.keySet();
	Iterator<String> keys = set.iterator();
	String keyStr = null;
	while (keys.hasNext()) {
		keyStr+=keys.next()+"\n";
	}
	String keyValueStr=null;
	Set<Entry<String,List<String>>> entries = headers.entrySet();
	Iterator item2 =entries.iterator();
	while(item2.hasNext()) {
		keyValueStr+=item2.next()+"\n";
	}
	HttpHeaders header = new HttpHeaders();
	header.setContentType(MediaType.TEXT_HTML);	
	header.set("ust", "GammaTaining");
	/*
	 * header2.setAcceptLanguageAsLocales(null);
	 * header2.setAcceptCharset((List<Charset>)Charset.defaultCharset());
	 */
	HttpHeaders header2=new HttpHeaders();
	
	header2.setContentType(MediaType.TEXT_HTML);
	header2.setContentLength(keyValueStr.length());
	header2.set("ust", "GammaTraining");
	return ResponseEntity.status(HttpStatus.ACCEPTED).headers(header2).body(keyValueStr);
	}
	
	
	 @GetMapping("/message") 
	 public ResponseEntity<String> greet(@RequestHeader HttpHeaders header) {
		 Charset charset =Charset.defaultCharset();
		 List<Charset> list = new ArrayList<>();
		 list.add(charset);
		 List<Locale> l=header.getAcceptLanguageAsLocales();
		 String str = l.toString();
		 if((str=="EN"))
		 {
			 return ResponseEntity.status(HttpStatus.OK).body("Hi");
		 }
		 return ResponseEntity.status(HttpStatus.OK).body("Welcome Mr."+str);
	  
	 }
	 
		/*
		 * 
		 * @PostMapping("/namegender") public ResponseEntity<String>
		 * nameandgendermessage(@RequestBody Member member) {
		 * if(member.getGender().equals("Female")) { return
		 * ResponseEntity.status(HttpStatus.OK).body("Welcome Ms."+member.getName());
		 * 
		 * } else if (member.getGender().equals("Male")) { return
		 * ResponseEntity.status(HttpStatus.OK).body("Welcome Mr."+member.getName()); }
		 * else { return
		 * ResponseEntity.status(HttpStatus.OK).body("Hai "+member.getName());
		 * 
		 * } }
		 */
	
}
