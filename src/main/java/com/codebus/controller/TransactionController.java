package com.codebus.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codebus.domain.TranData;
import com.codebus.domain.User;
import com.codebus.service.TransactionService;

@Controller
@RequestMapping("/transaction")
public class TransactionController {

	@Autowired
	TransactionService transactionService;
	
	@RequestMapping(value = "/account", method = RequestMethod.GET)
	public String interAccount(@ModelAttribute("tran") TranData tran, Model model) {
		model.addAttribute("transactionType","interAccount");
		return "transaction/transfer";
	}
	
	@RequestMapping(value = "/account", method = RequestMethod.POST)
	public String interAccount(@Valid @ModelAttribute("tran") TranData tran, Model model, BindingResult bindingResult) {
		model.addAttribute("transactionType","interAccount");
		if(bindingResult.hasErrors()) {
			return "transaction/transfer";
		}
		try {
			transactionService.interAccount(tran);
		} catch (Exception e) {
			System.out.println("Sorry, inter-account transfer failed!");
		}
		
		model.addAttribute("customer", tran.getAccountName()); // should back to customer
		return "redirect:/customers";
	}
	
	
	@RequestMapping(value = "/bank", method = RequestMethod.GET)
	public String interBank(@ModelAttribute("tran") TranData tran, Model model) {
		model.addAttribute("transactionType","interBank");
		return "transaction/transfer";
	}
	
	@RequestMapping(value = "/country", method = RequestMethod.GET)
	public String interCountry(@ModelAttribute("tran") TranData tran, Model model) {
		model.addAttribute("transactionType","interCountry");
		return "transaction/transfer";
	}
}
