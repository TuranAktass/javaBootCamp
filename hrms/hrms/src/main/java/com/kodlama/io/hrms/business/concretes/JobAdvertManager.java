package com.kodlama.io.hrms.business.concretes;

import java.util.List;

import com.kodlama.io.hrms.business.abstracts.JobAdvertService;
import com.kodlama.io.hrms.core.utilities.results.Result;
import com.kodlama.io.hrms.core.utilities.results.SuccessResult;
import com.kodlama.io.hrms.dataAccess.abstracts.JobAdvertDao;
import com.kodlama.io.hrms.entities.concretes.JobAdvert;

public class JobAdvertManager implements JobAdvertService{

	private JobAdvertDao jobAdvertDao;
	
	public JobAdvertManager(JobAdvertDao jobAdvertDao) {
		super();
		this.jobAdvertDao = jobAdvertDao;
	}
	
	@Override
	public List<JobAdvert> getAll() {
		return this.jobAdvertDao.findAll();
	}

	@Override
	public Result add(JobAdvert jobAdvert) {
		this.jobAdvertDao.save(jobAdvert);
		return new SuccessResult("job advert added!");
	}

}
