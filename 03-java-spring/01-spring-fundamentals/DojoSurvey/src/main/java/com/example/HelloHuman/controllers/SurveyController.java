package com.example.HelloHuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SurveyController {
	@RequestMapping("/")
	private String home() {
		return "home.jsp";
	}
	@RequestMapping("/info")
	public String info(
			@RequestParam("name") String name,
			@RequestParam("city") String city,
			@RequestParam("lang") String lang,
			@RequestParam("comment") String comment,
			Model userModel) {
		userModel.addAttribute("name", name);
		userModel.addAttribute("city", city);
		userModel.addAttribute("lang", lang);
		userModel.addAttribute("comment", comment);
		return "info.jsp";
	}
}
