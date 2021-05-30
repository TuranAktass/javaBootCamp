package com.kodlama.io.hrms.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlama.io.hrms.business.abstracts.CandidateService;
import com.kodlama.io.hrms.core.abstracts.EmailCheckService;
import com.kodlama.io.hrms.core.abstracts.EmailVerificationService;
import com.kodlama.io.hrms.core.abstracts.MernisCheckService;
import com.kodlama.io.hrms.core.concretes.MernisServiceAdapter;
import com.kodlama.io.hrms.core.utilities.results.ErrorResult;
import com.kodlama.io.hrms.core.utilities.results.Result;
import com.kodlama.io.hrms.core.utilities.results.SuccessResult;
import com.kodlama.io.hrms.dataAccess.abstracts.CandidateDao;
import com.kodlama.io.hrms.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService {

	private CandidateDao candidateDao;
	private MernisCheckService mernisService;
	private EmailCheckService emailCheckService;
	private EmailVerificationService emailVerificationService;
	
	private List<String> eMails =  new ArrayList<>();
	private List<String> nationalIds = new ArrayList<>();
	private List<Candidate> candidates = new ArrayList<>();

	@Autowired
	public CandidateManager(CandidateDao candidateDao, MernisCheckService mernisService, EmailCheckService emailCheckService, EmailVerificationService emailVerificationService) {
		super();
		this.candidateDao = candidateDao;
		this.mernisService = mernisService;
		this.emailCheckService = emailCheckService;
		this.emailVerificationService = emailVerificationService;
	}

	@Override
	public List<Candidate> getAll() {
		return this.candidateDao.findAll();
	}

	@Override
	public Result add(Candidate candidate) {
		getAllNationalIds();
		getAllEmails();
			
		if (!checkIfInfoValid(candidate)) {
			return new ErrorResult("missing user information!");
		}
		
		if(!emailCheckService.emailCheck(candidate.getEmail())) {
			return new ErrorResult("invalid email!");
		}
		
		if(!emailVerificationService.verifyEmail(candidate.getEmail())) {
			return new ErrorResult("email is not verified!");
		}


		if (emailIsItUsed(candidate.getEmail())) {
			return new ErrorResult("e-mail is already in use!");
		}

//		if(checkNationalIdLength(candidate.getNationalId())) {
//			return new ErrorResult("invalid national id!");
//		}

		if (nationalIdIsItUsed(candidate.getNationalId())) {
			return new ErrorResult("national id is already in use!");
		}
		
		if(!mernisService.checkIfRealPerson(candidate)) {
			return new ErrorResult("invalid user information!");
		}
		
		this.candidateDao.save(candidate);
		return new SuccessResult("candidate added!");

	}

	public boolean emailIsItUsed(String email) {
		if (eMails.contains(email)) // null check deleted
			return true;

		return false;
	}

	public boolean nationalIdIsItUsed(String nationalId) {
		if (nationalIds.contains(nationalId)) // null check deleted
			return true;

		return false;
	}

//	public boolean checkNationalIdLength(String nationalId) {
//		if(nationalId.length() != 11) {
//			return false;
//		}
//		
//		return true;
//	}

	public void getAllNationalIds() {
		for (int i = 0; i < getAllCandidates().size(); i++) {
			nationalIds.add(getAllCandidates().get(i).getNationalId());
		}
	}

	public boolean checkIfInfoValid(Candidate candidate) {
		if (candidate.getEmail() == null || candidate.getFirstName() == null || candidate.getLastName() == null
				|| candidate.getDateOfBirth() == null || candidate.getNationalId() == null
				|| candidate.getPassword() == null) {
			return false;
		}

		return true;
	}

	public void getAllEmails() {
		for (int i = 0; i < getAllCandidates().size(); i++) {
			eMails.add(getAllCandidates().get(i).getEmail());
		}

	}

	public List<Candidate> getAllCandidates() {
		this.candidates = candidateDao.findAll();
		return candidates;
	}

}
