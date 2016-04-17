package com.sac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloWorld {

	@RequestMapping( method = RequestMethod.GET)
	public String sayHello(ModelMap map){
		map.addAttribute("hello", "Hello, Welcome to Spring MVC !");
		
		return"hello";
	}
}
