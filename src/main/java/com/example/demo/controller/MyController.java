package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
	
	@GetMapping("/looping")
	public String iterateHnadler(Model model) {
		
		List names  = new ArrayList<>();
		
		names.add("demo");
		names.add("demo1");
		names.add("demo2");

		names.add("demo3");
		model.addAttribute("names",names);

		
		return "iterate";
	}
	
	
	@GetMapping("/condition")
	public String conditionHandler(Model model) {
		
		
		model.addAttribute("isActive" , true);
		model.addAttribute("gender" , "M");
		
		List names  = new ArrayList<>();

		
		names.add(35);
		names.add(40);


		model.addAttribute("names" , names);

	
		return "condition";
	}
	
	
	@GetMapping("/templates")
	public String templates(Model model) {
		
	

		
		return "includingFragments";
	}
	
	
	
}
