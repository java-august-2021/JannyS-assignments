package com.example.HelloHuman.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.HelloHuman.models.Dojo;
import com.example.HelloHuman.models.Ninja;
import com.example.HelloHuman.services.DojoService;
import com.example.HelloHuman.services.NinjaService;

@Controller
public class NinjaController {
	@Autowired
	private NinjaService ninjaService;
	@Autowired
	private DojoService dojoService;
	
	@GetMapping("/ninjas")
	public String ninjas(@ModelAttribute("ninjas") Ninja ninja, Model model) {
		List<Dojo> allDojos = this.dojoService.allDojos();
		model.addAttribute("allDojos", allDojos);
		return "ninjas.jsp";
	}
	
	@PostMapping("/ninjas/create")
	public String createNewNinja(
			@Valid @ModelAttribute("ninja") Ninja ninja,
			BindingResult result) {
		if(result.hasErrors()) {
			return "ninjas.jsp";
		}else {
			this.ninjaService.createNinja(ninja);

			return "redirect:/";
		}
	}
	
	@GetMapping("/info/{id}")
	public String info(@PathVariable Long id, Model model) {
		model.addAttribute("dojo", this.dojoService.findDojo(id));
		return "ninjas-dojo.jsp";
	}
}
