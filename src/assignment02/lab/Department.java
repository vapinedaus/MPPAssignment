package assignment02.lab;

import java.util.*;

public class Department {

	public ArrayList<Position> positions;
	public Department(String name, String location) {
		this.name= name;
		this.location= location;
		positions = new ArrayList<Position>();
	}
	
	private String name;
	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	private String location;

	public void print()
	{
		System.out.println("	Department: " + getName() + " Location: " + getLocation());
		positions.forEach(item-> 
		{
			item.print();
		});
	}
	
	double totalSalary;
	public double getSalary()
	{
		totalSalary=0;
		positions.forEach(item-> 
		{
			totalSalary = totalSalary + item.getSalary();
		});
		return totalSalary;
	}
	
	//lab3
	public void printReportingHierarchy()
	{
		System.out.println("	Department: " + getName() + " Location: " + getLocation());
		positions.forEach(item-> 
		{
			if (getDepartmentHead().equals(item))
			{
			   item.print();
			   item.printdownline();
			}
		});
		
	}
	
	Position deptHead = null;
	public Position getDepartmentHead()
	{

		positions.forEach(item-> 
		{
			if (item.isDepartmentHead == true)
			{
				deptHead =  item;
			}
		});
		
		return deptHead;
	
	}
	//lab3
	
	


}
