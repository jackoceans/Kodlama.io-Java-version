package kodlama;

public class Main {

	public static void main(String[] args) {
		
		CoursesName course1 = new CoursesName(); 
		course1.coursename = "c#-angular";
		course1.educatorname = "Engin Demiroð";
		course1.completionrate = 94;	
		course1.coursePrice = 0;
		
		CoursesName course2 = new CoursesName(); 
		course2.coursename = "Java-React";
		course2.educatorname = "Engin Demiroð";
		course2.completionrate = 15;	
		course2.coursePrice = 0;
		
		CoursesName course3 = new CoursesName(); 
		course3.coursename = "Programlamaya giriþ için temel kurs";
		course3.educatorname = "Engin Demiroð";
		course3.completionrate = 100;	
		course3.coursePrice = 0;
		
		
		CoursesName[] course = {course1,course2,course3};
		
		for (CoursesName coursesName : course) {
			System.out.println(coursesName.coursename);
			
		}
		System.out.println(course.length);
		
		Category category1 = new Category();
		category1.name = "Temel Giriþ";
		
		Category category2 = new Category();
		category2.name = "Orta Seviye";
		
		Category category3 = new Category();
		category3.name = "Ýleri Seviye";
		
		

	}

}
