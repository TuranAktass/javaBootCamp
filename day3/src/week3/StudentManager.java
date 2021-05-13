package week3;

public class StudentManager extends UserManager{
		public void addCourse(String course) {
			System.out.println("added new course: " + course);
		}
		
		public void deleteCourse(String course) {
			System.out.println("course deleted: " + course);
		}
}
