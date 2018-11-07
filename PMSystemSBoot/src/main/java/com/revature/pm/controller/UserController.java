package com.revature.pm.controller;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.pm.entities.User;
import com.revature.pm.service.UserService;

@RestController()
@CrossOrigin("*")
public class UserController {

		private Logger log = Logger.getLogger("UserController");
		
		@Autowired
		private UserService userService;
		
		@GetMapping("user/all")
		public List<User> getAllUser(){
			
			log.debug("inside getAllUser");
			return userService.getAllUser();
		}
		
		
		@PostMapping("/all/user/create")
		public void createUser(@RequestBody User u) {
			
			log.debug("inside createUser");	
			
			try {
					userService.createUser(u);
			}catch (IllegalArgumentException e) {
					
					log.warn(e.getMessage() + "inside UserController.createUser(User)" );
			}			
			
		}
		
}
