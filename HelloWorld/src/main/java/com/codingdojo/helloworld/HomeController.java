package com.codingdojo.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;


@Controller
@RequestMapping("/hello")
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "Hello World";
	}
	
	@RequestMapping("/world")
	public String world(Model model) {
		model.addAttribute("fruit", "banana");
		return "demo.jsp";
	}

}
