package com.kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlama.io.hrms.business.abstracts.JobTitleService;
import com.kodlama.io.hrms.core.utilities.results.Result;
import com.kodlama.io.hrms.dataAccess.abstracts.JobTitleDao;
import com.kodlama.io.hrms.entities.concretes.JobTitle;

import com.kodlama.io.hrms.core.utilities.results.*;


@Service
public class JobTitleManager implements JobTitleService{
	
	private JobTitleDao jobTitleDao;
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}
	
	@Override
	public DataResult <List<JobTitle>> getAll() {
	
		return new SuccessDataResult<List<JobTitle>>(this.jobTitleDao.findAll(), "data listed!");
	}

	@Override
	public Result add(JobTitle jobTitle) {
		if(getByJobTitle(jobTitle.getJobTitle()).getData() != null) {
			return new ErrorResult(jobTitle.getJobTitle() + " already exists!");
		}
		
		jobTitleDao.save(jobTitle);
		return new SuccessResult(jobTitle.getJobTitle() + " added");
	}

	@Override
	public Result delete(JobTitle jobTitle) {
		this.jobTitleDao.delete(jobTitle);
		return new SuccessResult("job title deleted");
	}

	@Override
	public DataResult<JobTitle> getByJobTitle(String title) {
		return new SuccessDataResult<JobTitle>(this.jobTitleDao.findByJobTitle(title));
	}
	
}
