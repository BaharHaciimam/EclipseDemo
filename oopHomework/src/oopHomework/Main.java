package oopHomework;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course1 = new Course (1,"Yazilim Gelistirici Kampi C","Engin Demirog","c kursunun detayi");
		Course course2 = new Course();
		
		course2.id = 2;
		course2.name ="Yazilim Gelistirici Kampi Java";
		course2.detail = "Java kursunun detayý";
		course2.instructor= "Engin Demirog";
		
		// Kurslar listelendi
		Course[] courses= {course1, course2};
		
		for (Course course:courses) {
			
			System.out.println("Course Name: " + course.name);
			System.out.println("Course Instructor: " + course.instructor);
			System.out.println("Course Price: " + course.detail + "\n");
		}
		
		//Kursa Kayýt ol
		CourseManager courseManager = new CourseManager();
		courseManager.EnrollCourse(course2);
		courseManager.ShowCourseInstructor(course1);
		
		System.out.println("------------------------------");
		
		Profile profile1 = new Profile(1,"Ali","ali@gmail.com","12345a","C,Java");
		Profile profile2 = new Profile();
		
		profile2.id=2;
		profile2.name="Veli";
		profile2.mail="veli@gmail.com";
		profile2.courses="Java";
		
		//Profiller listelendi.
		Profile[] profiles= {profile1, profile2};
		
		for(Profile profile:profiles) {
			
			System.out.println("Name: " + profile.name);
			System.out.println("Mail: " + profile.mail);
			System.out.println("Courses: " + profile.courses + "\n");
		}
			
		

	}

}
