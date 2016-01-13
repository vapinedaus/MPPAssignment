package assignment02.lab;

import java.util.*;

public class Employee {

	private Position empPossition;
	public Employee(int employeeID,String firstName,String middleInitial,String lastName,Date birthDate,String SSN, double salary,Position empPossition ) {
		// TODO Auto-generated constructor stub
		        this.employeeID = employeeID;
		        this.firstName= firstName;
		        this.middleInitial=middleInitial;
		        this.lastName=lastName;
		        this.birthDate=birthDate;
		        this.SSN=SSN;
		        this.salary=salary;
		        this.empPossition = empPossition;
	}
	
	private int employeeID;
	private String firstName;
	private String middleInitial;
	private String lastName;
	private Date birthDate;
	private String SSN;
	private double salary;
		
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary()
	{
       return this.salary;
	}
	public void print()
	{
		System.out.println("		    Employee ID: " + employeeID );
		System.out.println("			First Name: " + firstName );
		System.out.println("			Middle Initial: " + middleInitial );
		System.out.println("			Birth Date: " + birthDate );
		System.out.println("			SSN: " + SSN );
		System.out.println("			Salary: " + salary );
		System.out.println("			Position: " + empPossition.getTitle() );
		
		
	}
	
	

}
