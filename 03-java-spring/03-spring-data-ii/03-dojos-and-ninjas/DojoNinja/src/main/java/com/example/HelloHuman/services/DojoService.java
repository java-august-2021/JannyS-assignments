package com.example.HelloHuman.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HelloHuman.models.Dojo;
import com.example.HelloHuman.repositories.DojoRepository;

@Service
public class DojoService {
	@Autowired
	private DojoRepository dojoRepository;
	
	public DojoService(DojoRepository dojoRepository) {
		this.dojoRepository = dojoRepository;
	}
	public List<Dojo> allDojos(){
		return this.dojoRepository.findAll();
	}
	public Dojo findDojo(Long id) {
		return dojoRepository.findById(id).orElse(null);
	}
	public Dojo createDojo(Dojo dojo) {
		return this.dojoRepository.save(dojo);
	}
	public Dojo deleteDojo(Dojo id) {
		this.dojoRepository.delete(id);
		return id;
	}
	public Dojo updateDojo(Dojo dojo) {
		return dojoRepository.save(dojo);
	}
}

