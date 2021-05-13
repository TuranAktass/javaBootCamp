package week3;

public class Student extends User {
	private String[] courses;
	private int age;

	public Student(int id, String firstName, String lastName, String[] courses, int age) {
		super(id, firstName, lastName);

		this.age = age;
		this.courses = courses;
		// TODO Auto-generated constructor stub
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
