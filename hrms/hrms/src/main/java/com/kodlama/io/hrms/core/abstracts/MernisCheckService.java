package com.kodlama.io.hrms.core.abstracts;

import org.springframework.stereotype.Service;

import com.kodlama.io.hrms.entities.concretes.Candidate;

@Service
public interface MernisCheckService {

	public boolean checkIfRealPerson(Candidate candidate);	
}
