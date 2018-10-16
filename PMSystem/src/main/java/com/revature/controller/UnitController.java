package com.revature.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.revature.entities.P2Unit;
import com.revature.service.UnitServiceImp;

@Controller
public class UnitController {
	
	/*
	@Autowired(required = true)
	private UnitServiceImp unitServiceImp;
	@Qualifier(value="unitServiceImp")
	public void setUnitService(UnitServiceImp us) {
		this.unitServiceImp = us;
	}
	*/
	@RequestMapping(value="/")
	public String listUnits() {
		return "units";
		
	}
	/*
	@RequestMapping(value="/unit/rentunit{userid}/dstart{dstart}/davail{davailable}/occ{occupied}/unit{unitid}",method=RequestMethod.GET)
	public String rentUnit(@PathVariable ("userid")int userid,
							@PathVariable ("dstart") Date dstart,
							@PathVariable ("davailable")Date davailable,
							@PathVariable ("occupied") int occupied,
							@PathVariable ("unitid") int unitid){
		
		 this.unitServiceImp.rentUnit(userid, dstart, davailable, occupied, unitid); 
		return "redirect:/units";
		}*/
	}
