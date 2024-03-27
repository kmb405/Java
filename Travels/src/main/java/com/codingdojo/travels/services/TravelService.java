package com.codingdojo.travels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.travels.models.Travel;
import com.codingdojo.travels.repositories.TravelRepository;

@Service
public class TravelService {
	private final TravelRepository travelRepository;
	
	public TravelService(TravelRepository travelRepository) {
		this.travelRepository = travelRepository;
	}
	// returns all travels
	public List<Travel> allTravels() {
        return travelRepository.findAll();
    }
    // creates a travels
    public Travel createTravel(Travel b) {
        return travelRepository.save(b);
    }
    // retrieves a travels
    public Travel findTravel(Long id) {
        Optional<Travel> optionalTravel = travelRepository.findById(id);
        if(optionalTravel.isPresent()) {
            return optionalTravel.get();
        } else {
            return null;
        }
    }
    
    public Travel updateTravel(Travel b) {
		return travelRepository.save(b);
	}
	
	public void deleteTravel(Long id) {
		travelRepository.deleteById(id);
	}
}
