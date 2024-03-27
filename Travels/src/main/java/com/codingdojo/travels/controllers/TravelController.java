package com.codingdojo.travels.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.codingdojo.travels.models.Travel;
import com.codingdojo.travels.services.TravelService;

import jakarta.validation.Valid;

//... imports removed for brevity
@Controller
public class TravelController {
	private final TravelService travelService;
	 
	public TravelController(TravelService travelService) {
		this.travelService = travelService;
	}
 
	@GetMapping("/")
	public String index(@ModelAttribute("travel") Travel travel, Model model) {
		List<Travel> travels = travelService.allTravels();
        model.addAttribute("travels", travels);
		return "index.jsp";
	}
	
	@GetMapping("/show/{id}")
	public String show(@ModelAttribute("travel") Travel travel,
			@PathVariable("id") Long id,
			Model model) {
		Travel travel1 = travelService.findTravel(id);
        model.addAttribute("travel", travel1);
		return "show.jsp";
	}
	
	@PostMapping("/create")
	public String create(
			@Valid @ModelAttribute("travel") Travel travel,
			BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			List<Travel> travels = travelService.allTravels();
	        model.addAttribute("travels", travels);
			return "index.jsp";
		} else {
			travelService.createTravel(travel);
			return "redirect:/";
		}
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		travelService.deleteTravel(id);
		return "redirect:/";
	}
	
	@GetMapping("/update/{id}")
	public String edit(@ModelAttribute("travel") Travel travel,
			@PathVariable("id") Long id,
			Model model) {
		Travel travel1 = travelService.findTravel(id);
        model.addAttribute("travel", travel1);
		return "edit.jsp";
	}
	
	@PutMapping("/travels/{id}")
    public String update(@Valid @ModelAttribute("travel") Travel travel, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("travel", travel);
            return "edit.jsp";
        } else {
            travelService.updateTravel(travel);
            return "redirect:/";
        }
    }
}

