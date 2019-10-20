package com.healthyfood.foodcontentservice.Security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.healthyfood.foodcontentservice.FoodContentService.model.JwtAuthenticationToken;
import com.healthyfood.foodcontentservice.FoodContentService.model.JwtUser;
import com.healthyfood.foodcontentservice.FoodContentService.model.JwtUserDetails;

@Component
public class JwtAuthenticationProvider extends AbstractUserDetailsAuthenticationProvider {
	
	
    @Autowired
    JwtValidator validator;
	@Override
	protected void additionalAuthenticationChecks(UserDetails userDetails,
			UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected UserDetails retrieveUser(String username, UsernamePasswordAuthenticationToken authentication)
			throws AuthenticationException {
		
		JwtAuthenticationToken jwttoken =(JwtAuthenticationToken) authentication;
		String token=jwttoken.getToken();
		System.out.println("Tooooken");
		JwtUser jwtuser=validator.validate(token);
		if (jwtuser==null)
		{
			throw new RuntimeException("JWT Token is not Valid");
		}
		
		List<GrantedAuthority> grantedAuthorities = AuthorityUtils.commaSeparatedStringToAuthorityList(jwtuser.getRole());
		
		return new  JwtUserDetails(jwtuser.getUsername(),jwtuser.getId(),token,grantedAuthorities);
	}

	@Override
	public boolean supports(Class<?> authentication) {

		return (JwtAuthenticationToken.class.isAssignableFrom(authentication));
	}

	
	
	
	
	

}
