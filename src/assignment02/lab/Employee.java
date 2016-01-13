package assignment02.lab;

import java.util.*;

public class Employee {

	private Position empPossition;
	public Position getEmpPossition() {
		return empPossition;
	}
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
	public String Tab = "\t";
	public void print()
	{
		System.out.println(Tab + "Employee ID: " + employeeID );
		System.out.println(Tab + "First Name: " + firstName );
		System.out.println(Tab + "Middle Initial: " + middleInitial );
		System.out.println(Tab + "Birth Date: " + birthDate );
		System.out.println(Tab + "SSN: " + SSN );
		System.out.printf(Tab + "Salary: $ %,.2f \n",salary );
		//System.out.println(Tab + "Position: " + empPossition.getTitle() );
		
		
	}
	
	

}
