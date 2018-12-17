package com.codebus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
  
@Controller
public class HomeController {

 
	@RequestMapping({"/","/welcome"})
	public String welcome(Model model) {
		
		model.addAttribute("greeting", "Welcome to Guivulga!");
		model.addAttribute("tagline", "The Next Generation Money Transfer Service!");
		
		return "welcome";
	}
 
}
