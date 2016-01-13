package assignment02.lab;

import java.util.*;

public class Position {

	public ArrayList<Employee> employees = new ArrayList<Employee>();
	public Position(String title,String description) {
		this.title = title;
		this.description = description;
		
	}
	private String title;
	private String description;

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public void print()
	{
		System.out.println("		Position: " + getTitle() + " Description: " + getDescription());
		employees.forEach(item-> 
		{
			item.print();
		});
		
	}
	
	double totalSalary;
	public double getSalary()
	{
		totalSalary=0;
		employees.forEach(item-> 
		{
			totalSalary = totalSalary + item.getSalary();
		});
		
		
		return totalSalary;
	}

}
