package com.kodlama.io.hrms.entities.concretes;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "job_titles")

public class JobTitle{

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "title")
	private String jobTitle;
	
	public JobTitle() {
		
	}
	
	public JobTitle(int id, String jobTitle) {
		this.id = id;
		this.jobTitle = jobTitle;
	}
	
	
}
