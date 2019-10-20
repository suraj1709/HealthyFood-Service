package com.healthyfood.foodcontentservice.FoodContentService.model;

import java.util.Collection;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;



public class JwtAuthenticationToken extends UsernamePasswordAuthenticationToken {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -236517500319501686L;
	private String token;
	

	public JwtAuthenticationToken(String token) {
		super(null, null);
		this.token =token;
	}
	

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	


	@Override
	public Object getCredentials() {
		
		return null;
	}

	@Override
	public Object getPrincipal() {
	
		return null;
	}

	
	

}
