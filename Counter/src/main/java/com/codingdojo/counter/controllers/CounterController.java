package com.codingdojo.counter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class CounterController {
	    
    @RequestMapping("/")
    public String index(HttpSession session) {    		
    	// If the count is not already in session
		if (session.getAttribute("count") == null) {
		// Use setAttribute to initialize the count in session
			session.setAttribute("count", 0);
		}
		else {
		// increment the count by 1 using getAttribute and setAttribute
			int count = (int) session.getAttribute("count");
			count++;
			session.setAttribute("count", count);
		}
		return "index.jsp";
	}
    
    @RequestMapping("/counter")
    public String counter() {
    	return "counter.jsp";
    }
    
    @RequestMapping("/counter2")
    public String counter2(HttpSession session) {    		
    	// If the count is not already in session
		if (session.getAttribute("count") == null) {
		// Use setAttribute to initialize the count in session
			session.setAttribute("count", 0);
		}
		else {
		// increment the count by 1 using getAttribute and setAttribute
			int count = (int) session.getAttribute("count");
			count+=2;
			session.setAttribute("count", count);
		}
		return "counter2.jsp";
	}
    
    @RequestMapping("/clearcounter")
    public String clearCounter(HttpSession session) {
    	session.setAttribute("count", 0);
    	return "redirect:/counter";
    }
    
}


