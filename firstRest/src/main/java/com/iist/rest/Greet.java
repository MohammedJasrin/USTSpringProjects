package com.iist.rest;

import java.util.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/api1.0")
public class Greet {
	
	@GetMapping
	@RequestMapping("/greet")
	public String message() {
		return "Hai , everything good?";
	}
	@GetMapping
	@RequestMapping("/time")
	public String getTime() {
		return Calendar.getInstance().getTime()+" ";
		}
	@GetMapping
	@RequestMapping("/{gender}")
	public String gendermessage(@PathVariable String gender) {
	if(gender.equals("Female"))
	{
		return ("Welcome miss");
				
	}
	else if (gender.equals("Male"))
	{
		return ("Welcome mr");
	}
	else 
	{
		return ("Hai all");
	}
	}
	@GetMapping("/namegender/{name}/{gender}")
	public String nameandgendermessage(@PathVariable String name,@PathVariable String gender) {
	if(gender.equals("Female"))
	{
		return ("Welcome Ms."+name);
				
	}
	else if (gender.equals("Male"))
	{
		return ("Welcome Mr."+name);
	}
	else 
	{
		return ("Hai "+name);
	}
	}
}
