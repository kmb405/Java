package com.coding_dojo.student_roster.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.coding_dojo.student_roster.models.Student;


@Repository
public interface StudentRepo extends CrudRepository<Student, Long> {
	List<Student> findAll();
	
	@Query(value="SELECT * FROM students WHERE dorm_id = :dormId", nativeQuery = true)
	List<Student> findAllByForeignId(@Param("dormId") Long dormId);
	
	List<Student> findByDormIdIs(Long dormID);
}
