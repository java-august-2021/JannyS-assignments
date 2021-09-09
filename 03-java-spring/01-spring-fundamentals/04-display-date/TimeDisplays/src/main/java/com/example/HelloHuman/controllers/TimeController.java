package com.example.HelloHuman.controllers;

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TimeController {
	@RequestMapping("/")
		private String index() {
			return "index.jsp";
	}
	
	@RequestMapping("/date")
		private String date(Model model) {
			Date date = new java.util.Date();
			model.addAttribute("date", date);
				return "date.jsp";
	}
	
	@RequestMapping("/time")
		private String time(Model model) {
			Date time = new java.util.Date();
			model.addAttribute("time", time);
				return "time.jsp";
	}
}
