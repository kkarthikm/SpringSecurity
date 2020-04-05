package com.security.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/rest/ref")
public class ReferController {

	@GetMapping("/get")
	public String get() {
		return "well come";
	}
}
