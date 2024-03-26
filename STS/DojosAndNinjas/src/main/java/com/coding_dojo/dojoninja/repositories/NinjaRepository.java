package com.coding_dojo.dojoninja.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.coding_dojo.dojoninja.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long>{
	List<Ninja> findAll();
	
	@Query(value="SELECT * FROM ninjas WHERE dojo_id = :foreignId", nativeQuery = true)
	List<Ninja> findAllByForeignId(@Param("foreignId") Long foreignId);
}
