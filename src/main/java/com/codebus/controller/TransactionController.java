package com.codebus.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codebus.domain.Transaction;
import com.codebus.service.TransactionService;

@Controller
public class TransactionController {

	@Autowired
	TransactionService service;
	
	@RequestMapping(value = "/transaction", method = RequestMethod.GET)
	public String interAccount(@ModelAttribute("tran") Transaction tran, Model model) {
		return "transaction";
	}
	
	@RequestMapping(value = "/transaction", method = RequestMethod.POST)
	public String interAccount(@Valid @ModelAttribute("tran") Transaction tran, BindingResult result, Model model) {
		if (result.hasErrors()) return "transaction";
		
		service.interAccount(tran);
		
		return "statement";
	}
}
