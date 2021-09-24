package com.example.HelloHuman.validations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.example.HelloHuman.models.User;
import com.example.HelloHuman.repositories.UserRepository;

@Component
public class UserValidations {
	@Autowired
	private UserRepository uRepo;
	
	public boolean supports(Class<?> test) {
		return User.class.equals(test);
	}
	
	public void validate(Object target, Errors errors) {
		User user = (User)target;
		
		if(!user.getPassword().equals(user.getPasswordConfirmation())) {
			errors.rejectValue("password", "Match", "Passwords don't match");
		}
		
		if(this.uRepo.existsByEmail(user.getEmail())) {
			errors.rejectValue("email", "Match", "Email already registered");
		}
	}
}
