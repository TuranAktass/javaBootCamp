package com.kodlama.io.hrms.core.concretes;

import org.springframework.stereotype.Component;

import com.kodlama.io.hrms.core.abstracts.EmailVerificationService;

@Component
public class EmailVerificationManager implements EmailVerificationService{

	@Override
	public boolean verifyEmail(String email) {
		return true;
	}

}
