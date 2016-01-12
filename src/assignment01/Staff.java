package assignment01;

import java.util.*;

public class Staff  extends Person {

	public Staff()
	{
		
	}

	public Staff(String name, String phone, int age, double salary) {
		super.setName(name);
		super.setPhone(phone);
		super.setAge(age);
		setSalary(salary);
		setType("staff");
	}
	
	private String type;
	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	private double salary;
	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//Staff-Student
	private double gpa;
	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	private Date date;

    public void setDate(Date date){
        this.date = date;
    }

    public Date getDate(){
        return this.date;
    }
	
    public ArrayList<Course> courses = new ArrayList<Course>();
    public void AddCourse(Course c)
	{
		courses.add(c);
	}
	//Staff-Student

	

	
	
	
}
