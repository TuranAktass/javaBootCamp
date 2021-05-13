package day5_assignment1.entities.concretes;

import day5_assignment1.entities.abstracts.Entity;

public class User implements Entity {
	private String firstName;
	private String lastName;
	private String e_mail;
	private String password;
	private boolean isValidate;

	public User() {

	}

	public User(String firstName, String lastName, String e_mail, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.e_mail = e_mail;
		this.password = password;
		this.isValidate = false;// default olarak false geliyor, eðer kullanýcý linke týklarsa true olacak.
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

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isValidate() {
		return isValidate;
	}

	public void setValidate(boolean isValidate) {
		this.isValidate = isValidate;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}
