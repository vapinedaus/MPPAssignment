package assignment01;

import java.util.ArrayList;

public class Student  extends Person {
	
	public Student(String name, String phone, int age, double gpa) {
		super.setName(name);
		super.setPhone(phone);
		super.setAge(age);
		setGpa(gpa);
	}
	
	private double gpa;

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}


	
	public ArrayList<Course> courses = new ArrayList<Course>();
	
}
