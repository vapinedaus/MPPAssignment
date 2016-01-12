package assignment01;

import java.util.*;

public class StaffStudent  extends Staff {

	
	public StaffStudent() {
		// TODO Auto-generated constructor stub
	}
	
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

	

	
	
	
}

