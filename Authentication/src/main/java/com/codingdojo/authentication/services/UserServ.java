<<<<<<< HEAD
package com.codingdojo.authentication.services;

import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.codingdojo.authentication.models.LoginUser;
import com.codingdojo.authentication.models.User;
import com.codingdojo.authentication.repositories.UserRepo;

@Service
public class UserServ {
	
	@Autowired
	private UserRepo userRepo;
	
	public void createUser(User p) {
		userRepo.save(p);
	}
	
	public User findById(Long id) {
		Optional<User> thisUser = userRepo.findById(id);
		if (thisUser.isPresent()) {
			return thisUser.get();
		} else {
			return null;
		}
	}
	
	public List<User> getAll() {
		return userRepo.findAll();
	}
	
	public User register(User newUser, BindingResult result) {
		
		Optional<User> existingUser = userRepo.findByEmail(newUser.getEmail());
		if(existingUser.isPresent()) {
			result.rejectValue("email", "Matches", "The email is already in use");
			
		}
		
		if(!newUser.getConfirm().equals(newUser.getPassword())) {
			result.rejectValue("confirm", "Matches", "The Comfirm Passord doesn't match.");
		}
		
		if(result.hasErrors()) {
			return null;
		}
		
		String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
		
		newUser.setPassword(hashed);
		
		userRepo.save(newUser);
		return newUser;
	}
	
	public User login(LoginUser newLogin, BindingResult result) {
		Optional<User> potentialUser = userRepo.findByEmail(newLogin.getEmail());
		if(potentialUser.isEmpty()) {
			result.rejectValue("email", "Exists", "No user found with this email");
		}
		
		if(potentialUser.isPresent()) {
			if(!BCrypt.checkpw(newLogin.getPassword(), potentialUser.get().getPassword())) {
			    result.rejectValue("password", "Matches", "Invalid Password!");
			}
		}
		
		if(result.hasErrors()) {
			return null;			
		}
		
		return potentialUser.get();
		
	}

	public UserRepo getUserRepo() {
		return userRepo;
	}

	public void setUserRepo(UserRepo userRepo) {
		this.userRepo = userRepo;
	}
	
	
}
=======
package com.codingdojo.authentication.services;

import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.codingdojo.authentication.models.LoginUser;
import com.codingdojo.authentication.models.User;
import com.codingdojo.authentication.repositories.UserRepo;

@Service
public class UserServ {
	
	@Autowired
	private UserRepo userRepo;
	
	public void createUser(User p) {
		userRepo.save(p);
	}
	
	public User findById(Long id) {
		Optional<User> thisUser = userRepo.findById(id);
		if (thisUser.isPresent()) {
			return thisUser.get();
		} else {
			return null;
		}
	}
	
	public List<User> getAll() {
		return userRepo.findAll();
	}
	
	public User register(User newUser, BindingResult result) {
		
		Optional<User> existingUser = userRepo.findByEmail(newUser.getEmail());
		if(existingUser.isPresent()) {
			result.rejectValue("email", "Matches", "The email is already in use");
			
		}
		
		if(!newUser.getConfirm().equals(newUser.getPassword())) {
			result.rejectValue("confirm", "Matches", "The Comfirm Passord doesn't match.");
		}
		
		if(result.hasErrors()) {
			return null;
		}
		
		String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
		
		newUser.setPassword(hashed);
		
		userRepo.save(newUser);
		return newUser;
	}
	
	public User login(LoginUser newLogin, BindingResult result) {
		Optional<User> potentialUser = userRepo.findByEmail(newLogin.getEmail());
		if(potentialUser.isEmpty()) {
			result.rejectValue("email", "Exists", "No user found with this email");
		}
		
		if(potentialUser.isPresent()) {
			if(!BCrypt.checkpw(newLogin.getPassword(), potentialUser.get().getPassword())) {
			    result.rejectValue("password", "Matches", "Invalid Password!");
			}
		}
		
		if(result.hasErrors()) {
			return null;			
		}
		
		return potentialUser.get();
		
	}

	public UserRepo getUserRepo() {
		return userRepo;
	}

	public void setUserRepo(UserRepo userRepo) {
		this.userRepo = userRepo;
	}
	
	
}
>>>>>>> 38f25c936d9d8c892c5f21a1b49cef51149babe4
