package com.kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kodlama.io.hrms.business.abstracts.CityService;
import com.kodlama.io.hrms.core.utilities.results.Result;
import com.kodlama.io.hrms.core.utilities.results.SuccessResult;
import com.kodlama.io.hrms.dataAccess.abstracts.CityDao;
import com.kodlama.io.hrms.entities.concretes.City;

@Service
public class CityManager implements CityService{
	
	private CityDao cityDao;
	
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}
	
	@Override
	public List<City> getAll() {
		return this.cityDao.findAll();
	}

	@Override
	public Result add(City city) {
		this.cityDao.save(city);
		return new SuccessResult("city added!");	
	}

}
