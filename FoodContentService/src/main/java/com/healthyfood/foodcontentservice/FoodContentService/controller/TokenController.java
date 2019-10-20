package com.healthyfood.foodcontentservice.FoodContentService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.healthyfood.foodcontentservice.FoodContentService.model.JwtUser;
import com.healthyfood.foodcontentservice.Security.JwtGenerator;

@RestController
@RequestMapping("/token")
public class TokenController {
   
	
	@Autowired
	public JwtGenerator jwtgenerator;
	
	
	

	@PostMapping
	@ResponseBody
	public  String generate(@RequestBody JwtUser jwtuser)
	{
		
		return jwtgenerator.generate(jwtuser);
	}
}
