package oopHomework;

public class CourseManager {

	public void EnrollCourse(Course course) {
		System.out.println(course.name +" kursuna kayit basari ile gerceklesti. ");
	}
	
	public void ShowCourseInstructor(Course course) {
		System.out.println(course.name +" kursunun eðitmeni: "+course.instructor);
	}
}
