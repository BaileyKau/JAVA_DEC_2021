package com.john.sessionForm.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SessionController {
	
	@RequestMapping("/")
	public String index(Model model, HttpSession session) {
		String name = "Carol";
		model.addAttribute("nameKey", name);	
		
		String sessionName = "Bob";
		session.setAttribute("sessionName", sessionName);
		
		Integer num = 33;
		session.setAttribute("num", num);
		
		return "index.jsp";
	}
	
	@RequestMapping("/other")
	public String other(HttpSession sesh, Model model) {
//		check if something is in session:
		if (sesh.getAttribute("num") != null) {
//		extracting from session:
			Integer seshNum = (Integer) sesh.getAttribute("num");
			System.out.println(seshNum);
			
			seshNum += 10000;
			model.addAttribute("newNum", seshNum);
//		sesh.setAttribute("num", seshNum);
			return "other.jsp";
		} else {
			model.addAttribute("noSessionError", "that is not in session");
			return "other.jsp";
		}
	}
	
	

}
