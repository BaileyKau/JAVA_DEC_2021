package com.john.templates.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String index(Model model) {
		String x = "<h2>this is a cool variable</h2>";
		model.addAttribute("myKey", x);
		model.addAttribute("num", 123);
		return "cool.jsp";
	}
	
	@RequestMapping("/cool")
	public String cool(Model elephant) {
		System.out.println("/cool invoked");
		
		ArrayList<String> dojos = new ArrayList<String>();
		dojos.add("Burbank");
		dojos.add("Chicago");
		dojos.add("Bellevue");
		
		elephant.addAttribute("dojosArray", dojos);
		
				
		return "cooler.jsp";
	}

}
