package com.sac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sac.exception.SpringException;
import com.sac.vo.Student;

@Controller
public class SpringMVCExceptionController {

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public ModelAndView student(){
		return new ModelAndView("student", "command", new Student());
	}
	
	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute Student student, ModelMap modelMap){
		
		if(student.getName().length() < 5){
			throw new SpringException("Name length should be atleast 5 characters long");
		}else{
			modelMap.addAttribute("name", student.getName());
		}
		
		if(student.getAge() < 10){
			throw new SpringException("A person should be above 10 years");
		}else{
			modelMap.addAttribute("age", student.getAge());
		}
		modelMap.addAttribute("id", student.getId());
		
		return "result";
	}
}
