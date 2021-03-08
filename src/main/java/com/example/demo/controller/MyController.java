package com.example.demo.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	@GetMapping("/about")
	public String about(Model model) {
		
		System.out.println("INside handler +++++++++");
		model.addAttribute("name" ,"Prinkpal SINGH");
		model.addAttribute("currentDate" ,new Date().toString());
		return "about";
	}
	
}
