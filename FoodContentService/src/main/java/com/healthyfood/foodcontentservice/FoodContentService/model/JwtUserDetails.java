package com.healthyfood.foodcontentservice.FoodContentService.model;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class JwtUserDetails implements UserDetails {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6561022254565057549L;
	private String username;
	private String token;
	private Long id;
	private Collection<? extends GrantedAuthority> authorities;

	
	public String getToken() {
		return token;
	}

	public Long getId() {
		return id;
	}
public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
		this.authorities = authorities;
	}

	public JwtUserDetails(String username, long id, String token, List<GrantedAuthority> grantedAuthorities) {
		this.username = username;
		this.token = token;
		this.id = id;
		this.authorities = grantedAuthorities;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return username	;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	



	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
