package com.kodlama.io.hrms.core.abstracts;

import org.springframework.stereotype.Service;

@Service
public interface EmailVerificationService {

	public boolean verifyEmail(String email);
}
