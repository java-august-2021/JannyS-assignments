package com.example.HelloHuman.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HelloHuman.models.Ninja;
import com.example.HelloHuman.repositories.NinjaRepository;

@Service
public class NinjaService {
		@Autowired
		private NinjaRepository ninjaRepository;
		
		public NinjaService(NinjaRepository ninjaRepository) {
			this.ninjaRepository = ninjaRepository;
		}
		public List<Ninja> allNinjas(){
			return this.ninjaRepository.findAll();
		}
		public Ninja findNinja(Long id) {
			return ninjaRepository.findById(id).orElse(null);
		}
		public Ninja createNinja(Ninja ninja) {
			return this.ninjaRepository.save(ninja);
		}
		public Ninja deleteNinja(Ninja id) {
			this.ninjaRepository.delete(id);
			return id;
		}
		public Ninja updateNinja(Ninja ninja) {
			return ninjaRepository.save(ninja);
		}
	}
