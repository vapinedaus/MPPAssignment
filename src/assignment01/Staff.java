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
	}
	
	
	private double salary;
	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}

	

	
	
	
}
