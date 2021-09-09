package com.example.HelloHuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;    

@Controller
public class HomeController {
	@RequestMapping("/")
	private String index(@RequestParam(value="name", required=false, defaultValue="Human") String name, Model viewModel) {
		viewModel.addAttribute("name", name);
		return "name.jsp";
	}
}
	