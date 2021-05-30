package com.kodlama.io.hrms.core.concretes;

import org.springframework.stereotype.Component;

import com.kodlama.io.hrms.core.abstracts.MernisCheckService;
import com.kodlama.io.hrms.entities.concretes.Candidate;

@Component
public class FakeMernisAdapter implements MernisCheckService{

	@Override
	public boolean checkIfRealPerson(Candidate candidate) {
		// TODO Auto-generated method stub
		return true;
	}

}
