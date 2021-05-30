package com.kodlama.io.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "job_adverts")
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvert {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "description")
	private String description;

	@Column(name = "salary_min")
	private int minSalary;

	@Column(name = "salary_max")
	private int maxSalary;

	@Column(name = "open_position_count")
	private int openPositions;

	@Column(name = "deadline")
	private LocalDate deadline;

	/*
	 * 
	 * @Column(name = "published_at") private LocalDate publishedAt;
	 * 
	 * @Column(name = "created_at") private LocalDate createdAt;
	 * 
	 * @Column(name = "is_open") private boolean isOpen;
	 * 
	 * @Column(name = "is_active") private boolean isActive;
	 * 
	 * @Column(name = "is_deleted") private boolean isDeleted;
	 * 
	 */

	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;

	@ManyToOne
	@JoinColumn(name = "job_title_id")
	private JobTitle jobTitle;

	@ManyToOne
	@JoinColumn(name = "employer_id")
	private Employer employer;

}
