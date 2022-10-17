package com.saran.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SaranController {
	@RequestMapping("/")
	public String getMessage(ModelMap model) {
		model.addAttribute("hello","Welcome to the world of SpringMVC");
		return "index";
	}
	
	@RequestMapping("/again")
	public String getMessageAgain(ModelMap model) {
		model.addAttribute("hello","This is from the getMessageAgain method");
		return "index";
	}

}
