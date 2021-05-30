package com.kodlama.io.hrms.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlama.io.hrms.business.abstracts.EmployerService;
import com.kodlama.io.hrms.core.utilities.results.ErrorResult;
import com.kodlama.io.hrms.core.utilities.results.Result;
import com.kodlama.io.hrms.core.utilities.results.SuccessResult;
import com.kodlama.io.hrms.dataAccess.abstracts.EmployerDao;
import com.kodlama.io.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{

	private EmployerDao employerDao;
	
	private List<Employer> employers = new ArrayList<>();
	private List<String> eMails = new ArrayList<>();
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}
	
	@Override
	public List<Employer> getAll() {
		return this.employerDao.findAll();
	}
	
	@Override
	public Result add(Employer employer) {
		getAllEmployers();
		getAllEmails();
		
		if(emailIsItUsed(employer.getEmail())) {
			return new ErrorResult("email is already in use!");
		}
		
		this.employerDao.save(employer);
		return new SuccessResult("employer added!");
	}
	
	public boolean emailIsItUsed(String email) {
		if(eMails != null && eMails.contains(email)) {
			return true;
		}
		
		return false;
	}
	
	public void getAllEmails() {
		for(int i = 0; i < employers.size(); i++) {
			eMails.add(employers.get(i).getEmail());
		}
	}
	
	public void getAllEmployers() {
		this.employers = employerDao.findAll();
	}

	
}
