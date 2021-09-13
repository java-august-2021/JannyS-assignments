package com.example.HelloHuman.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.HelloHuman.models.Dojo;
import com.example.HelloHuman.services.DojoService;
import com.example.HelloHuman.services.NinjaService;

@Controller
public class HomeController {
@Autowired
private DojoService dojoService;
@Autowired
private NinjaService ninjaService;

@GetMapping("/dash")
public String dashboard(Model model) {
	model.addAttribute("ninjas", this.ninjaService.allNinjas());
	model.addAttribute("dojos", this.dojoService.allDojos());
	return "dash.jsp";
}

@GetMapping("/")
public String index(@ModelAttribute("dojo") Dojo dojo, Model model) {
	model.addAttribute("allDojos", this.dojoService.allDojos());
	return "home.jsp";
}

@PostMapping("/newDojo")
public String newDojo(
		@Valid @ModelAttribute("dojo") Dojo dojo,
		BindingResult result) {
	if(result.hasErrors()) {
		return "home.jsp";
	}else {
		this.dojoService.createDojo(dojo);

		return "redirect:/";
		}
	}
}
