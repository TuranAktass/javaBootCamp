package week3;

public class Instructor extends User {

	private String[] courses;
	private String branch;

	public Instructor(int id, String firstName, String lastName, String[] courses, String branch) {
		super(id, firstName, lastName);

		this.courses = courses;
		this.branch = branch;
		// TODO Auto-generated constructor stub
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

}
