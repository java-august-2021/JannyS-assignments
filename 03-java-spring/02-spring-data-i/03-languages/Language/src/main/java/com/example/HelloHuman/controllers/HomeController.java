package com.example.HelloHuman.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.HelloHuman.models.Language;
import com.example.HelloHuman.services.LanguageService;

@Controller
public class HomeController {
	@Autowired
	private LanguageService sService;

	@GetMapping("/")
	public String index(@ModelAttribute("newLanguage")Language language) {
		return "index.jsp";
	}
	
	@PostMapping("/create")
	public String create(@ModelAttribute("newLanguage") Language language) {
		Language newLanguage = sService.createLanguage(language);
		return "redirect:/welcome";
	}
	
	@GetMapping("/welcome")
	public String welcome(Model model) {
		List<Language>languages=this.sService.allLanguages();
		model.addAttribute("languages", languages);
		return "welcome.jsp";
	}
	
			
}
