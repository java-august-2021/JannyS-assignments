package com.example.HelloHuman.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.HelloHuman.models.User;
import com.example.HelloHuman.services.UserService;
import com.example.HelloHuman.validations.UserValidations;

@Controller
public class UserController {
	@Autowired
	private UserService uService;
	
	@Autowired
	private UserValidations validator;

	

    @GetMapping("/")
    public String registerForm(@ModelAttribute("user") User user) {
        return "register.jsp";
    }

    @PostMapping("/register")
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
    	validator.validate(user, result);
		if (result.hasErrors()) {
            return "register.jsp";
        } else {
        	User newUser = uService.registerUser(user);
        	session.setAttribute("loggedUser", newUser.getId());
        	return "redirect:/dash";
        }
    }
        
    @PostMapping("/login")
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session, RedirectAttributes redirectAttributes) {
    	if (uService.authenticateUser(email, password)) {
    		User loggedUser = uService.getByEmail(email);
    		session.setAttribute("loggedUser", loggedUser.getId());
    		return "redirect:/dash";
    	}else {
    		redirectAttributes.addFlashAttribute("loginError", "Invalid E-mail or Password");
    		return "register.jsp";
    	}
    }
    
    @GetMapping("/dash")
    public String home(HttpSession session, Model model) {
    	if (session.getAttribute("loggedUser") != null) {
    		Long userId = (Long) session.getAttribute("loggedUser");
    		User loggedUser = uService.findUser(userId);
    		model.addAttribute("user", loggedUser);
    		return "home.jsp";
    	} else {
    		
    		return "register.jsp";
    	}	
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
    	session.invalidate();
    	return "redirect:/";
    }
}
