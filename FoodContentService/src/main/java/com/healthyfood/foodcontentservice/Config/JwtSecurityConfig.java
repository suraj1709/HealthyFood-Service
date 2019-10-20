package com.healthyfood.foodcontentservice.Config;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.healthyfood.foodcontentservice.Security.JwtAutenticationEntryPoint;
import com.healthyfood.foodcontentservice.Security.JwtAuthenticationProvider;
import com.healthyfood.foodcontentservice.Security.JwtAuthenticationTokenFilter;
import com.healthyfood.foodcontentservice.Security.JwtSucessHandler;

@EnableGlobalMethodSecurity(prePostEnabled=true)
@EnableWebSecurity
@Configuration
public class JwtSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private JwtAuthenticationProvider authenticationprovider;
	@Autowired
	private JwtAutenticationEntryPoint entrypoint;
	
	@Bean
	public AuthenticationManager authenticationmanager()
	{
		return new ProviderManager(Collections.singletonList(authenticationprovider));
	}
	
	@Bean
	public JwtAuthenticationTokenFilter authentication()
	{
		JwtAuthenticationTokenFilter filter= new JwtAuthenticationTokenFilter();
		filter.setAuthenticationManager(authenticationmanager());
		filter.setAuthenticationSuccessHandler(new JwtSucessHandler());
		return filter;
	}


	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
		.authorizeRequests()
		.antMatchers("**/Item/**").authenticated()
		.and()
		.exceptionHandling()
		.authenticationEntryPoint(entrypoint)
		.and().sessionManagement()
		.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		http.addFilterBefore(authentication(), UsernamePasswordAuthenticationFilter.class);
		http.headers().cacheControl();
		
	}
	
	
	

}
