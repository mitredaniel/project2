package com.revature.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.revature.entities.P2Unit;
import com.revature.service.UnitServiceImp;

@RestController
@CrossOrigin( allowedHeaders="*", origins="http://localhost:4200")
@EnableWebMvc
public class UnitController {
	
	@Autowired
	UnitServiceImp unitservice;
	@CrossOrigin(allowedHeaders="*",origins = "http://localhost:4200")
	@PostMapping(value="/unit")
	public List getUnits() {
		return unitservice.availableUnit();
		
	}
	@CrossOrigin(allowedHeaders="*",origins = "http://localhost:4200")
	@GetMapping(value="/unitoccupied")
	public List getUnitoccupied() {
		return unitservice.occupiedUnit();
		
	}
	
	}
