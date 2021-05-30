package com.kodlama.io.hrms.business.abstracts;

import java.util.List;

import com.kodlama.io.hrms.core.utilities.results.Result;
import com.kodlama.io.hrms.entities.concretes.JobAdvert;

public interface JobAdvertService {

	List<JobAdvert> getAll();
	Result add(JobAdvert jobAdvert);
}
