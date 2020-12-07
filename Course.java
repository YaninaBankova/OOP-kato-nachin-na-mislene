package edu.smg;

public class Course {
	private String coarseName;
	private String[] students = new String[100];
	private int numberOfStudents = 0;
	
	public String getCoarseName() {
		return coarseName;
	}
	public void setCoarseName(String coarseName) {
		this.coarseName = coarseName;
	}
	public String[] getStudents() {
		return students;
	}
	public void setStudents(String[] students) {
		this.students = students;
	}
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}
	
	public Course(String coarseName) {
		setCoarseName(coarseName);
	}
	
	public void addStudent(String student) {
		students[getNumberOfStudents()] = student;
		setNumberOfStudents(getNumberOfStudents() + 1);
	}
	public void dropStudent(String student) {
		for(int i = 0; i < getNumberOfStudents(); i++) {
			if(student.equals(students[i])) {
				for(int j = i; j < getNumberOfStudents() - 1; j++) {
					students[j] = students[j + 1];
					
				}
				students[getNumberOfStudents() - 1] = null;
				setNumberOfStudents(getNumberOfStudents() - 1);
				break;
			}
		}
	}
}
