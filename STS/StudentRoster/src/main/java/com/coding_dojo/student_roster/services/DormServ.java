package com.coding_dojo.student_roster.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding_dojo.student_roster.models.Dorm;
import com.coding_dojo.student_roster.repositories.DormRepo;

@Service
public class DormServ {
	@Autowired
	DormRepo dormRepo;
	
	
	public List<Dorm> allDorms() {
		return dormRepo.findAll();
	}
	
	public Dorm createDorm(Dorm dorm) {
		return dormRepo.save(dorm);
	}
	
	public Dorm findDorm(Long id) {
		Optional<Dorm> optionalDorm = dormRepo.findById(id);
		if(optionalDorm.isPresent()) {
			return optionalDorm.get();
		} else {
			return null;
		}
	}
}
