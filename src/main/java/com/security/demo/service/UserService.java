package com.security.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.security.demo.config.CustomUserDetails;
import com.security.demo.model.UserModel;
import com.security.demo.repository.UserRepository;

/*
import com.javatechie.spring.security.api.model.User;
import com.javatechie.spring.security.api.repository.UserRepository;
 * 
 * */



@Service
public class UserService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	public UserModel saveModel(UserModel model) {
		UserModel user=	userRepository.save(model);
		return user;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		UserModel mdl=userRepository.findByName(username);
		CustomUserDetails  UserDetails=null;
		
		if(mdl!=null) {
			UserDetails=new CustomUserDetails();
			UserDetails.setUser(mdl);
		}
		else {
			throw new UsernameNotFoundException(username);
		}
		return UserDetails;
	}
}