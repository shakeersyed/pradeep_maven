package com.gcp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.gcp.model.Project;


@Controller
@SessionAttributes("project")
public class ProjectController {
	
	@RequestMapping(value="/project", method = RequestMethod.GET)
	public String displayEventPage(Model model) {
		
		Project project = new Project();
		project.setName("Java Project");
		model.addAttribute("project", project);
	
		return "project";
	}
	
	@RequestMapping(value="/project", method = RequestMethod.POST)
	public String processEvent(@ModelAttribute("project") Project project) {
		System.out.println(project);
		
		return "redirect:index.html";
	}

}
