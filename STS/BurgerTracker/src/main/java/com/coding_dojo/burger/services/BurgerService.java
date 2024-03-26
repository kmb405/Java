package com.coding_dojo.burger.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.coding_dojo.burger.models.Burger;
import com.coding_dojo.burger.repositories.BurgerRepository;

@Service
public class BurgerService {
	private final BurgerRepository burgerRepository;
	
	public BurgerService(BurgerRepository burgerRepository) {
		this.burgerRepository = burgerRepository;
	}
	// returns all burgers
	public List<Burger> allBurgers() {
        return burgerRepository.findAll();
    }
    // creates a burgers
    public Burger createBurger(Burger b) {
        return burgerRepository.save(b);
    }
    // retrieves a burgers
    public Burger findBurger(Long id) {
        Optional<Burger> optionalBurger = burgerRepository.findById(id);
        if(optionalBurger.isPresent()) {
            return optionalBurger.get();
        } else {
            return null;
        }
    }
}
