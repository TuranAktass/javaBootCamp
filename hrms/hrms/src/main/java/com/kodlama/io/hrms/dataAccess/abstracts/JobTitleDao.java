package com.kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlama.io.hrms.entities.concretes.JobTitle;


public interface JobTitleDao extends JpaRepository<JobTitle, Integer>{
	JobTitle findByJobTitle(String title);
}
