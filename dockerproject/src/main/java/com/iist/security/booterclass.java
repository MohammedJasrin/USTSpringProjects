package com.iist.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hai")
public class booterclass {
@GetMapping
public String hello() {
	return "hello";
}
}
