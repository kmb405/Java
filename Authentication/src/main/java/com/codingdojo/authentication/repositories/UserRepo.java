<<<<<<< HEAD
package com.codingdojo.authentication.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.authentication.models.User;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
	
	List<User>findAll();
	
	Optional<User> findByEmail(String email);
}
=======
package com.codingdojo.authentication.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.authentication.models.User;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
	
	List<User>findAll();
	
	Optional<User> findByEmail(String email);
}
>>>>>>> 38f25c936d9d8c892c5f21a1b49cef51149babe4
