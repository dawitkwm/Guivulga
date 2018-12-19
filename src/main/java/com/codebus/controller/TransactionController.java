package com.codebus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codebus.domain.TranData;
import com.codebus.service.TransactionService;

@Controller
@RequestMapping("/transaction")
public class TransactionController {

	@Autowired
	TransactionService service;
	
	@RequestMapping(value = "/account", method = RequestMethod.GET)
	public String interAccount(@ModelAttribute("tran") TranData tran, Model model) {
		model.addAttribute("transactionType","interAccount");
		return "transaction/transfer";
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
