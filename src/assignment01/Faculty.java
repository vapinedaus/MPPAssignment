package assignment01;

import java.util.ArrayList;

public class Faculty extends Person  {

	public Faculty(String name, String phone, int age, double salary) {
		super.setName(name);
		super.setPhone(phone);
		super.setAge(age);
		setSalary(salary);
	}
	
	private double salary;
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getTotalUnits()
	{
		
		return 1;
	}
	
	
	public ArrayList<Course> courses = new ArrayList<Course>();
	
	

}
