package com.codingdojo.travels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.travels.models.Travel;

@Repository
public interface TravelRepository extends CrudRepository<Travel, Long> {
	List<Travel> findAll();
    // this method finds books with descriptions containing the search string

}