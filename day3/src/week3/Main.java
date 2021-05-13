package week3;

public class Main {

	public static void main(String args[]) {
		String [] courses = {"a","b","c"};
		 
		User user = new User(0,"ali","ata");
		
		Instructor instructor = new Instructor(10,"veli","kat�",courses,"computer science"
		);
		
		Student student = new Student(100,"�grenci","�grenir",courses, 23);
		
		
		UserManager uManager = new UserManager();
		StudentManager sManager = new StudentManager();
		InstructorManager iManager = new InstructorManager();
		
		uManager.add(user);
		uManager.delete(user);
		
		sManager.add(student);
		sManager.addCourse("history");
		sManager.deleteCourse("history");

		iManager.add(instructor);
		iManager.changeBranch("computer science");
		iManager.addCourse("java");
	}
}
