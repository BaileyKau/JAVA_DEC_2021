package com.john.css_test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@GetMapping("/")
	public String index1() {
		return "index.jsp";
	}
	
	@GetMapping("/index")
	public String index2() {
		return "page/page.jsp";
	}

}
