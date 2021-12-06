package com.john.sessionForm.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class FormController {
	
//	display the loginpage
	@RequestMapping("/login")
	public String form() {
		return "form.jsp";
	}
	
//	process the logic POST method
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(
				@RequestParam(value="email") String email,
				@RequestParam(value="password") String password,
				@RequestParam(value="age") Integer age,
				RedirectAttributes flash,
				HttpSession sesh) {
	    System.out.println(email + " : " + password + " : \n age:" + age);
	    if (age < 10) {
	    	System.out.println("you are not old enough");
	    	flash.addFlashAttribute("ageErr", "you are not old enough" );
	    	return "redirect:/login";
	    } else {	   
	    	sesh.setAttribute("age", age);
	    	return "redirect:/dashboard";
	    }
	}
	
	@RequestMapping("/dashboard")
	public String dashboard() {
		return "dashboard.jsp";
	}

}
