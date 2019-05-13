package com.capgemini.cityservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.cityservice.entity.City;
import com.capgemini.cityservice.service.CityService;

@RestController
public class CityController {

	@Autowired
	private CityService service;
	
	@PostMapping("/city")
	public ResponseEntity<City> addNewCity(@RequestBody City city){
		service.addNew(city);
		return new ResponseEntity<City>(city,HttpStatus.CREATED);
	}
	

	
	
}
