package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.entities.P2User;
import com.revature.service.UserServiceImp;

@RestController
@CrossOrigin(origins="http://localhost:4200")

public class UserController {
	
	@Autowired
	UserServiceImp uservice;
	
	@RequestMapping(value="/getuser/{id}", method=RequestMethod.GET, produces="application/json")
	public ResponseEntity method2(@PathVariable("id") Integer id) {
		
		P2User user = uservice.getUserById(id);
		return new ResponseEntity(user,HttpStatus.OK);
	}
	
	@PostMapping(value="/ntenant",consumes="application/json",produces="application/json")
	public ResponseEntity addUser(@RequestBody P2User user) {
		uservice.addUser(user);
		return new ResponseEntity(user, HttpStatus.OK);
		
	}
	
	@PostMapping(value="/login", consumes="application/json", produces="application/json")
	public ResponseEntity userLogin(@RequestBody P2User user) {
		
		P2User u2 = uservice.verifyUser(user.getLogin(),user.getPassword());
		
		return new ResponseEntity(u2,HttpStatus.OK);
	}

	
	
	
	
}
