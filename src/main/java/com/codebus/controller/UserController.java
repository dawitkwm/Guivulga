package com.codebus.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codebus.domain.User;
import com.codebus.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value={"", "/all"}, method=RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("users", userService.findAll());
		return "users";
	}
	
	@RequestMapping(value="/user", method=RequestMethod.GET)
	public String getUserById(Model model, @RequestParam("id") Long id) {
		User user = userService.findOne(id);
		model.addAttribute("user", user);
		return "user";
	}
	
	@RequestMapping(value ="/add", method = RequestMethod.GET)
	public String getAddNewUserForm(@ModelAttribute("newUser") User newUser) {
		return "addUser";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST) 
	public String processAddNewUserForm(@Valid @ModelAttribute("newUser") User newUser, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "addUser";
		}
		
		try {
			userService.save(newUser);
		} catch (Exception e) {
			System.out.println("Sorry, adding new user failed!");
		}
		return "redirect:/users";
	}

}
