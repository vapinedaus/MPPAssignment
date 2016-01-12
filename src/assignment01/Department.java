package assignment01;

import java.util.*;

public class Department {

	
	private String name;
	
	public ArrayList<Person> persons = new ArrayList<Person>();
	
	public Department(String name) {
		this.name = name;
	}
	
	public String Name()
	{
		return this.name;
	}
	
	
	 // computes the sum of all the salaries (per month) paid to faculty and staff.
	private double totalSalary=0;
	public double getTotalSalary()
	{
		
		persons.forEach(person ->
		{
			if (person instanceof Faculty)
			{
				Faculty faculty= (Faculty) person;
				totalSalary = totalSalary + faculty.getSalary();
			}
			else if (person instanceof  Student==false)
			{
				Staff staff= (Staff) person;
				totalSalary = totalSalary + staff.getSalary();
			}
			
			
			
		}
		);
		 
		 return totalSalary;
	}
	
	public void showAllMembers()
	{
		// shows the name, phone number, age and type (student, faculty or staff) of all members in the department.
		
		persons.forEach(person ->
		{
			if (person instanceof Faculty)
			{
				Faculty faculty= (Faculty) person;
				System.out.println("Name:" + faculty.getName() + " Phone Number:" + faculty.getPhone() + " Age:" + faculty.getAge() + " Type: faculty");
			}

			else if (person instanceof Student)
			{
				Student student= (Student) person;
				System.out.println("Name:" + student.getName() + " Phone Number:" + student.getPhone() + " Age:" + student.getAge() + " Type: student");
			}
			else 
			{
				Staff staff= (Staff) person;
				System.out.println("Name:" + staff.getName() + " Phone Number:" + staff.getPhone() + " Age:" + staff.getAge() + " Type: staff");
			}
			
			
			
		}
		);
	}
	
	//***** shows a list of all faculty names and the total number of units they teach.
	
    public ArrayList<Course> courses = new ArrayList<Course>();
	
	public void AddCourse(Course c)
	{
		courses.add(c);
	}
	private int unitsPerFaculty;
	public void unitsPerFaculty()
	{
		persons.forEach(person ->
		{
			if (person instanceof Faculty)
			{
				Faculty faculty= (Faculty) person;
				
				
				unitsPerFaculty = 0;
				courses.forEach(facultyCourses -> 
				{
					
					if (facultyCourses.faculty.equals(faculty))
					{
						unitsPerFaculty = unitsPerFaculty + facultyCourses.getUnits();
						
					}
				}
				
				);
				
						
				System.out.println("Name:" + faculty.getName() + " Total Number of Units:" + unitsPerFaculty );   
				
			
			}
		});
		
		
		
	}
	/**/
	public void AddPerson(Person p)
	{
		persons.add(p);
	}
	
	
	
	

}
