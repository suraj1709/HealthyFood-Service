package com.healthyfood.foodcontentservice.Security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.RequestMatcher;

import com.healthyfood.foodcontentservice.FoodContentService.model.JwtAuthenticationToken;

public class JwtAuthenticationTokenFilter extends AbstractAuthenticationProcessingFilter {

	

	public JwtAuthenticationTokenFilter() {
		super("/Item/**");
	}

	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException, IOException, ServletException {
		String header=request.getHeader("Authorization");
		System.out.println(header);
		if (header==null || !header.startsWith("Token "))
		{
			throw new RuntimeException("JWT token is missing");
		}
		String authentizationToken=header.substring(6);
		JwtAuthenticationToken token = new JwtAuthenticationToken(authentizationToken);
		System.out.println(token);
			
		return getAuthenticationManager().authenticate(token);
        
	}

	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
			Authentication authResult) throws IOException, ServletException {
		super.successfulAuthentication(request, response, chain, authResult);
		chain.doFilter(request, response);
	}

	
}
