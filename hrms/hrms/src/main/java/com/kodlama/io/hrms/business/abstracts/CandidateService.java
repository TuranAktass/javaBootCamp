package com.kodlama.io.hrms.business.abstracts;

import java.util.List;

import com.kodlama.io.hrms.core.utilities.results.Result;
import com.kodlama.io.hrms.entities.concretes.Candidate;

public interface CandidateService {

	List<Candidate> getAll();
	Result add(Candidate candidate);
}
