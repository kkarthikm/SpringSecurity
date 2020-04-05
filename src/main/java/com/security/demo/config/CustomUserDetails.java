package com.security.demo.config;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.security.demo.model.UserModel;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class CustomUserDetails implements UserDetails{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8597403734598142412L;
	
	private UserModel user;
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return user.getUserRole().stream().map(role -> new SimpleGrantedAuthority("ROLE_"+role)).collect(Collectors.toList());
	}

	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getName();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	/*
	 * public CustomUserDetails(UserModel user) { this.user = user; }
	 * 
	 * public CustomUserDetails() { super(); }
	 */

}
