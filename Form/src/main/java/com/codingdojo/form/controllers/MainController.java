package com.codingdojo.form.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("omikuji")
public class MainController {
	@GetMapping("")
	public String index() {
		return "omikuji.jsp";
	}
	
	@PostMapping("/form")
	public String form(
			@RequestParam(value="number") String num,
			@RequestParam(value="city") String city,
			@RequestParam(value="person") String person,
			@RequestParam(value="hobby") String hobby,
			@RequestParam(value="thing") String thing,
			@RequestParam(value="quote") String quote,
			HttpSession session) {
		session.setAttribute("number", num);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("thing", thing);
		session.setAttribute("quote", quote);
		
		return "redirect:/omikuji/show";
	}
	
	@GetMapping("/show")
	public String fortune() {
		return "fortune.jsp";
	}
}
