package com.kodlama.io.hrms.entities.concretes;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "job_titles")
@AllArgsConstructor
@NoArgsConstructor

public class JobTitle{

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "job_title")
	private String jobTitle;
	
}
