package com.codebus.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codebus.domain.Bank;
import com.codebus.domain.Transaction;
import com.codebus.service.BankService;
import com.codebus.service.TransactionService;

@Controller
public class TransactionController {

	@Autowired
	TransactionService service;
	
	@Autowired
	BankService bankService;
	
	@RequestMapping(value = "/transaction", method = RequestMethod.GET)
	public String interAccount(@ModelAttribute("tran") Transaction tran, Model model) {
		
		model.addAttribute("countries", countries());
		
		List<Bank> banks = bankService.findAll();
		model.addAttribute("banks", banks);
		
		return "transaction";
	}
	
	@RequestMapping(value = "/transaction", method = RequestMethod.POST)
	public String interAccount(@Valid @ModelAttribute("tran") Transaction tran, BindingResult result, Model model) {
		
		if (result.hasErrors()) {
			model.addAttribute("countries", countries());
			
			List<Bank> banks = bankService.findAll();
			model.addAttribute("banks", banks);
			
			return "transaction";
		}
		
		service.interCountry(tran);
		
		return "redirect:/statement";
	}
	
	@RequestMapping(value = "/statement", method = RequestMethod.GET)
	public String statement(Model model) {
		
		List<Transaction> trans = service.statement();
		
		model.addAttribute("trans", trans);
		
		return "statement";
	}
	
	private Map<String, String> countries() {
		Map<String, String> countries = new HashMap<String, String>();
		
		countries.put("us", "United States");
		countries.put("mn", "Mongolia");
		countries.put("et", "Ethiopia");
		
		return countries;
	}
}
