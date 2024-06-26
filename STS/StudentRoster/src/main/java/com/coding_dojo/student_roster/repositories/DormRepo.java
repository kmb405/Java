package com.coding_dojo.student_roster.repositories;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.coding_dojo.student_roster.models.Dorm;


@Repository
public interface DormRepo extends CrudRepository<Dorm, Long> {
	List<Dorm> findAll();
}
