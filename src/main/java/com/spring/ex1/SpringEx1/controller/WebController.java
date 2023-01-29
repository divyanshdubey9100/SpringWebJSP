package com.spring.ex1.SpringEx1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
	
	@RequestMapping("/")
	private String index() {
		System.out.println("home page called...");
		return "index";
	}

	@RequestMapping("display")
	private String visitDisplay() {
		System.out.println("Visit To Display Page ....");
		return "display";
	}
}
