package com.healthyfood.foodcontentservice.Security;

import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties.Jwt;
import org.springframework.stereotype.Component;

import com.healthyfood.foodcontentservice.FoodContentService.model.JwtUser;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.impl.crypto.JwtSigner;

@Component
public class JwtValidator {
	
	 String Secret="secret";

	public JwtUser validate(String token) {
		JwtUser jwtuser = null;
		
		try
		{
		Claims claims= Jwts.parser().setSigningKey(Secret).parseClaimsJws(token).getBody();
		
		
		
		jwtuser = new JwtUser();
		jwtuser.setUsername(claims.getSubject());
		jwtuser.setId(Long.parseLong((String)claims.get("userid")));
		jwtuser.setRole((String)claims.get("role"));
		System.out.println("UserValidated");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return jwtuser;
		
	}

}
