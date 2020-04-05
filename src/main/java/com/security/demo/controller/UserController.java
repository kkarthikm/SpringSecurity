package com.security.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.demo.model.UserModel;
import com.security.demo.service.UserService;

@RestController
@RequestMapping("/secure/sec")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private BCryptPasswordEncoder encoder;

	@PreAuthorize("hasAnyRole('ADMIN')")
	@PostMapping("/add")
	public UserModel userSave(@RequestBody UserModel model) {
		String encd = model.getPassword();
		String passw = encoder.encode(encd);
		model.setPassword(passw);
		return userService.saveModel(model);
	}
}
