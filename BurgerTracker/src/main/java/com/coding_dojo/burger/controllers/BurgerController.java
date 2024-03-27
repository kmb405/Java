package com.coding_dojo.burger.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.coding_dojo.burger.models.Burger;
import com.coding_dojo.burger.services.BurgerService;

import jakarta.validation.Valid;

//... imports removed for brevity
@Controller
public class BurgerController {
	private final BurgerService burgerService;
	 
	public BurgerController(BurgerService burgerService) {
		this.burgerService = burgerService;
	}
 
	@GetMapping("/")
	public String index(@ModelAttribute("burger") Burger burger, Model model) {
		List<Burger> burgers = burgerService.allBurgers();
        model.addAttribute("burgers", burgers);
		return "index.jsp";
	}
	
	@PostMapping("/create")
	public String create(
			@Valid @ModelAttribute("burger") Burger burger,
			BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			List<Burger> burgers = burgerService.allBurgers();
	        model.addAttribute("burgers", burgers);
			return "index.jsp";
		} else {
			burgerService.createBurger(burger);
			return "redirect:/";
		}
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		burgerService.deleteBurger(id);
		return "redirect:/";
	}
	
	@GetMapping("/update/{id}")
	public String index(@ModelAttribute("burger") Burger burger,
			@PathVariable("id") Long id,
			Model model) {
		Burger burger1 = burgerService.findBurger(id);
        model.addAttribute("burgers", burger1);
		return "edit.jsp";
	}
	
	@PutMapping("/burgers/{id}")
    public String update(@Valid @ModelAttribute("burger") Burger burger, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("burger", burger);
            return "edit.jsp";
        } else {
            burgerService.updateBurger(burger);
            return "redirect:/";
        }
    }
}

