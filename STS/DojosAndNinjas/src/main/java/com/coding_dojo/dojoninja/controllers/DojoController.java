package com.coding_dojo.dojoninja.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.coding_dojo.dojoninja.models.Dojo;
import com.coding_dojo.dojoninja.models.Ninja;
import com.coding_dojo.dojoninja.services.DojoService;
import com.coding_dojo.dojoninja.services.NinjaService;

import jakarta.validation.Valid;

@Controller
public class DojoController {
	
    @Autowired
    private DojoService dojoService;
     
    @Autowired
    private NinjaService ninjaService;
	 
 	public DojoController(DojoService dojoService) {
 		this.dojoService = dojoService;
 	}
    
    @GetMapping("/")
    public String index(Model model) {
    	List<Dojo> dojos = dojoService.allDojos();
    	model.addAttribute("dojos", dojos);
    	System.out.println(dojos);
    	return "index.jsp";
    }
    
    @GetMapping("/newdojo")
    public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
    	return "newdojo.jsp";
    }
    
    @GetMapping("/newninja")
    public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
    	List<Dojo> dojos = dojoService.allDojos();
    	model.addAttribute("dojos", dojos);
    	return "newninja.jsp";
    }
    
    @GetMapping("/dojo/{dojo_id}")
    public String dojo(Model model, @PathVariable("dojo_id") Long dojo_id) {
    	Dojo dojo = dojoService.findDojo(dojo_id);
    	List<Ninja> ninjas = ninjaService.allNinjasInDojo(dojo_id);
    	model.addAttribute("dojo", dojo);
    	model.addAttribute("ninjas", ninjas);
    	return "dojo.jsp";
    }
    
    @PostMapping("/createDojo")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "newdojo.jsp";
		}
		dojoService.createDojo(dojo);
		return "redirect:/";
	}
    
    @PostMapping("/createNinja")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if (result.hasErrors()) {
			return "newninja.jsp";
		}
		ninjaService.createNinja(ninja);
		return "redirect:/";
	}
}
