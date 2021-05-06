package day4_assignment3.entities;

import java.time.LocalDate;

;

public class User {
	private int id;
	private String firstName;
	private String lastName;
	private String nationalityId;
	private LocalDate dateOfBirth;
	
	public User() {
		
	}

	public User(int id, String firstName, String lastName, String nationaltyId, LocalDate dateOfBirth) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationaltyId;
		this.dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationaltyId) {
		this.nationalityId = nationaltyId;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
}
