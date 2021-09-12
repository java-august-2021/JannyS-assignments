package com.example.HelloHuman.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.HelloHuman.models.Language;
import com.example.HelloHuman.repositories.LanguageRepository;

@Service
public class LanguageService {
	private LanguageRepository languageRepository;
	public LanguageService(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	public List<Language> allLanguages(){
		return languageRepository.findAll();
	}
	public Language findLanguage(Long id) {
		return languageRepository.findById(id).orElse(null);
	}
	public Language createLanguage(Language language) {
		return languageRepository.save(language);
	}
}
