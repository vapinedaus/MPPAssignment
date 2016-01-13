package assignment01;

import java.util.*;

public class StaffStudents extends Student implements IStaff {

	public StaffStudents(String name, String phone, int age, double gpa, double salary, Date date) {
		super(name, phone, age, gpa);
		setType("staffstudent");
		setSalary(salary);
		setDate(date);
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
	
	//Staff Student only
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
    //Staff Student only
	

}
