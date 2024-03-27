package com.codingdojo.ninjagold.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
	Random rand = new Random();
	ArrayList<String> list = new ArrayList<String>();
	@GetMapping("/")
	public String index(
			HttpSession session
			) {
		if (session.getAttribute("gold") == null) {
			session.setAttribute("gold", 0);
		}
		
		session.setAttribute("activities", list);
		return "index.jsp";
	}
	
	@PostMapping("/getGold")
	public String getGold(
			@RequestParam(value="task") String task,
			HttpSession session
			) {
		Date datetime = new Date();
		if (task.equals("farm")) {
			int gold = (int) session.getAttribute("gold");
			int rand_int1 = rand.nextInt(10, 20);
			gold += rand_int1;
			session.setAttribute("gold", gold);
			session.setAttribute("activities", list.add(String.format("You entered a farm and earned %d gold. %s", rand_int1, datetime)));
		} else if (task.equals("cave")) {
			int gold = (int) session.getAttribute("gold");
			int rand_int1 = rand.nextInt(5, 10);
			gold += rand_int1;
			session.setAttribute("gold", gold);
			session.setAttribute("activities", list.add(String.format("You entered a cave and earned %d gold. %s", rand_int1, datetime)));
		} else if (task.equals("house")) {
			int gold = (int) session.getAttribute("gold");
			int rand_int1 = rand.nextInt(2, 5);
			gold += rand_int1;
			session.setAttribute("gold", gold);
			session.setAttribute("activities", list.add(String.format("You entered a house and earned %d gold. %s", rand_int1, datetime)));
		} else if (task.equals("quest")) {
			int gold = (int) session.getAttribute("gold");
			int rand_int1 = rand.nextInt(50);
			int rand_int2 = rand.nextInt(2);
			if (rand_int2 == 1) {
				gold += rand_int1;
				session.setAttribute("gold", gold);
				session.setAttribute("activities", list.add(String.format("You completed a quest and earned %d gold. %s", rand_int1, datetime)));
			} else {
				gold -= rand_int1;
				session.setAttribute("gold", gold);
				session.setAttribute("activities", list.add(String.format("You failed a quest and lost %d gold. %s", rand_int1, datetime)));
			}
		} else {
			int gold = (int) session.getAttribute("gold");
			int rand_int1 = rand.nextInt(5, 20);
			gold -= rand_int1;
			session.setAttribute("gold", gold);
			session.setAttribute("activities", list.add(String.format("You went to the spa and paid %d gold. %s", rand_int1, datetime)));
		}
		return "redirect:/";
	}
	
	@PostMapping("/clear")
	public String clear(
			HttpSession session
			) {
		session.invalidate();
		list.clear();
		return "redirect:/";
	}
		
}
