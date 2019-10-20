package com.healthyfood.foodcontentservice.Security;

import org.springframework.stereotype.Component;

import com.healthyfood.foodcontentservice.FoodContentService.model.JwtUser;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.lang.Strings;


@Component
public class JwtGenerator {

	public String generate(JwtUser jwtuser)
	{
		Claims claims=Jwts.claims().setSubject(jwtuser.getUsername());
		claims.put("userid", String.valueOf(jwtuser.getId()));
		claims.put("role",jwtuser.getRole());

		
				
				
				
	return Jwts.builder().setClaims(claims).signWith(SignatureAlgorithm.HS512,"secret").compact();
	}
}
