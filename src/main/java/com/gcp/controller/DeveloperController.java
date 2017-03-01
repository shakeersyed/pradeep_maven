package com.gcp.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gcp.model.Developer;

@Controller
public class DeveloperController {
	
@RequestMapping(value="/developer", method = RequestMethod.GET)
public String displayDeveloperPage(Model model) {
	Developer developer = new Developer();
	
	model.addAttribute("developer", developer);
	
	return "developer";
}

@RequestMapping(value="/developer", method = RequestMethod.POST)
public String processDeveloper(@Valid Developer developer, BindingResult result, Model m) {
	
	System.out.println(developer);
	
	if(result.hasErrors()) {
		return "developer";
	}
	
	return "redirect:index.html";
	
}
}
