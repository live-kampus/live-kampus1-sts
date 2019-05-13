package com.capgemini.cityservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.cityservice.dao.CityDao;
import com.capgemini.cityservice.entity.City;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private CityDao dao;
	
	@Override
	public City addNew(City city) {
		
		dao.save(city);
		
		return city;
	
		
	}

	@Override
	public City updateCity(City city) {
		return null;
	}

	@Override
	public void delete(int cityId) {
		dao.deleteById(cityId);
		
	}

	
}
