package com.codingdojo.AaronCarey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.AaronCarey.models.Admin;
import com.codingdojo.AaronCarey.service.AaronCareyService;
@Controller
public class AaronCareyController {
	private final AaronCareyService acs;
	public AaronCareyController(AaronCareyService acs) {
		this.acs = acs;
	}
	@RequestMapping("/")
	public String index() {
		System.out.println("WOWOWW");
		return "index.jsp"; 
	}
}
