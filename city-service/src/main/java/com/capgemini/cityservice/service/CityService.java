package com.capgemini.cityservice.service;

import com.capgemini.cityservice.entity.City;

public interface CityService {

	public City addNew(City city);
	
	public City updateCity(City city);
	 
	public void delete(int cityId);
	
}
