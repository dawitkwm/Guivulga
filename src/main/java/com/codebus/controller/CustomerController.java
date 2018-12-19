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

import com.codebus.domain.Customer;
import com.codebus.service.CustomerService;

@Controller
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value={"", "/all"}, method=RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("customers", customerService.findAll());
		return "customer/customers";
	}
	
	@RequestMapping(value="/customer", method=RequestMethod.GET)
	public String getUserById(Model model, @RequestParam("id") Long id) {
		Customer customer = customerService.findOne(id);
		model.addAttribute("user", customer);
		return "customer/customer";
	}
	
	@RequestMapping(value ="/add", method = RequestMethod.GET)
	public String getAddNewUserForm(@ModelAttribute("newCustomer") Customer newCustomer) {
		return "customer/customeradd";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST) 
	public String processAddNewUserForm(@Valid @ModelAttribute("newCustomer") Customer newCustomer, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "customer/customeradd";
		}
		
		try {
			customerService.save(newCustomer);
		} catch (Exception e) {
			System.out.println("Sorry, adding new customer failed!");
		}
		return "redirect:/customers";
	}

}
