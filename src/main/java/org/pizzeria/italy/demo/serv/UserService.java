package org.pizzeria.italy.demo.serv;

import java.util.List;
import java.util.Optional;

import org.pizzeria.italy.demo.pojo.User;
import org.pizzeria.italy.demo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService{

	@Autowired
	private UserRepo userRepo;
	
	public void save(User user) {
		userRepo.save(user);
	}
	public void delete(User user) {
		userRepo.delete(user);
	}
	public Optional<User> findById(int id) {
		
		return userRepo.findById(id);
	}
	public List<User> findAll() {
		
		return userRepo.findAll();
	}
	
	
}
