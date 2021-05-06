package week3;

public class InstructorManager extends UserManager{

	public void addCourse(String course) {
		System.out.println("Course added: " + course);
	}
	
	public void changeBranch(String branch) {
		System.out.println("Branch changed to " + branch);
	}
	
}
