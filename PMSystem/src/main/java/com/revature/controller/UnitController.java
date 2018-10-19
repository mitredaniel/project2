package com.revature.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.entities.P2Unit;
import com.revature.service.UnitServiceImp;

@RestController
@CrossOrigin(origins="http://localhost:4200")

public class UnitController {
	
	@Autowired
	UnitServiceImp unitservice;
	
	@PostMapping(value="/unit")
	public List getUnits() {
		return unitservice.availableUnit();
		
	}
	
	@PostMapping(value="/unitoccupied")
	public List getUnitoccupied() {
		return unitservice.occupiedUnit();
		
	}
	
	}
