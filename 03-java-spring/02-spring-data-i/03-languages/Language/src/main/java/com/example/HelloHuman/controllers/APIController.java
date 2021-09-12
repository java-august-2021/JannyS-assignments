package com.example.HelloHuman.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HelloHuman.models.Language;
import com.example.HelloHuman.repositories.LanguageRepository;
import com.example.HelloHuman.services.LanguageService;

@RestController
public class APIController {
	@Autowired
	private LanguageService sService;
	
	@GetMapping("/languages")
	private List<Language> getLanguages() {
		return this.sService.allLanguages();
	}
	@GetMapping("/languages/{id}")
	private Language getOneLanguages(@PathVariable("id")Long id) {
		return this.sService.findLanguage(id);
	}
	@PostMapping("/languages/create")
		private Language create(Language language) {
			return sService.createLanguage(language);
	}
	
}

