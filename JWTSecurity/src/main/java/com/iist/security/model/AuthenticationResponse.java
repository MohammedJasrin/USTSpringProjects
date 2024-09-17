package com.iist.security.model;

import org.springframework.web.bind.annotation.CrossOrigin;


public class AuthenticationResponse {

	private final String jwt;



	public AuthenticationResponse(String jwt) {

		

		this.jwt = jwt;

	}



	public String getJwt() {

		return jwt;

	}



}