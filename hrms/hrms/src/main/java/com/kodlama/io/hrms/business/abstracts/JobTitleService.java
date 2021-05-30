package com.kodlama.io.hrms.business.abstracts;

import java.util.List;

import com.kodlama.io.hrms.core.utilities.results.*;
import com.kodlama.io.hrms.entities.concretes.JobTitle;

public interface JobTitleService {

	public DataResult<List<JobTitle>> getAll();
	public Result add(JobTitle jobTitle);
	public Result delete(JobTitle jobTitle);
	public DataResult<JobTitle> getByJobTitle(String title);
}
