package com.cellers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CellersController {

	@GetMapping("/")
	public String display(Model model) {
		model.addAttribute("abc", "Welcome to the world of SpringBootMVC");
		return "welcome";
	}

	@GetMapping("/2/{name}")
	public ModelAndView display2(@PathVariable("name") String name) {
		ModelAndView model = new ModelAndView();
		model.setViewName("welcome");
		model.addObject("xyz", name);
		return model;
	}

}
