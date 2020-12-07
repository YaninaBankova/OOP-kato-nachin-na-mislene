package edu.smg;

public class CourseTest {

	public static void main(String[] args) {
		
		Course math = new Course("Mathematics");
		Course inf = new Course("Informatics");
		math.addStudent("Ivan Kolev");
		math.addStudent("Yordan Stoilov");
		math.addStudent("Martin Bogdanov");
		math.addStudent("Kaloyan Ivanov");
		inf.addStudent("Yana Popova");
		inf.addStudent("Ivailo Petrov");
		inf.addStudent("Aleks Veselinov");
		String[] students = math.getStudents();
		System.out.println("Number of students for course " + math.getCoarseName() + " : " + math.getNumberOfStudents());
		for(int i = 0; i < math.getNumberOfStudents(); i++) {
			System.out.println((i + 1) + ". " + students[i]);
		}
		students = inf.getStudents();
		System.out.println("Number of students for course " + inf.getCoarseName() + " : " + inf.getNumberOfStudents());
		for(int i = 0; i < inf.getNumberOfStudents(); i++) {
			System.out.println((i + 1) + ". " + students[i]);
		}
		math.dropStudent("Kaloyan Ivanov");
		inf.dropStudent("Yana Velikova");
		students = math.getStudents();
		System.out.println("Number of students for course " + math.getCoarseName() + " : " + math.getNumberOfStudents());
		for(int i = 0; i < math.getNumberOfStudents(); i++) {
			System.out.println((i + 1) + ". " + students[i]);
		}
		students = inf.getStudents();
		System.out.println("Number of students for course " + inf.getCoarseName() + " : " + inf.getNumberOfStudents());
		for(int i = 0; i < inf.getNumberOfStudents(); i++) {
			System.out.println((i + 1) + ". " + students[i]);
		}
		
	}

}
