package com.john.spring_demo.unicorns;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoolController {
	
	@RequestMapping("/")
	public String coolRoute() {
		return "<h1>Hello World!</h1><p>this is cool!!!!</p><script>alert('you are h4xor')</script>";
	}
	
	@RequestMapping("/cool")
	public String cooler() {
		return "you are cool!";
	}
	
	// localhost:8080/cats/search?q=.....
	@RequestMapping("/cats/search")
	public String catSearch(@RequestParam(value="aaa") String queryTxt) {
		return String.format("you searched for %s, ", queryTxt);
	}
	
	@RequestMapping("/cats/{ownerName}/{numOfCats}")
	public String cats(@PathVariable("ownerName") String ownerName,
					   @PathVariable("numOfCats") Integer numOfCats) {
		System.out.println(ownerName + " : " + numOfCats);
		return "hello " + ownerName + "! you have " + numOfCats + " cats!";
	}
	
	

}
