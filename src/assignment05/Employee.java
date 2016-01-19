package assignment05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public abstract class Employee {
  
	
	
	private int empID;
	private ArrayList<Paycheck> paychecks;
	public Employee()
	{
		
	}
	public Employee(int empID) {
		this.empID = empID;
		paychecks = new ArrayList<Paycheck>();
	}
	
	
	public void print()
	{   System.out.println("================================================================");
		System.out.println("Employee ID: " + empID);
		System.out.println("Employee Type: " + this.getClass().getSimpleName() );
		for (Paycheck paycheck : paychecks)
		{
			paycheck.print();
		}
		 System.out.println("================================================================");
	}
	
	public Paycheck calcCompensation (int month, int year) throws ParseException
	{
		
		SimpleDateFormat format = new SimpleDateFormat("MM-yyyy");
		
		Date paycheckDate = format.parse(month + "-" + year);
		
		Calendar startDate = Calendar.getInstance();
		startDate.setTime(DateRange.getFirstDayOfTheMonth(paycheckDate));   
		Calendar endDate = Calendar.getInstance();
		endDate.setTime(DateRange.getLastDayOfTheMonth(paycheckDate));   
		
		DateRange daterange = new DateRange(startDate,endDate);
	
		return new Paycheck(calcGrossPay(daterange),daterange);
	}
	
	public abstract double calcGrossPay (DateRange daterange);
	
	
	public int getEmpID() {
		return empID;
	}
	
	public void AddPaychekcs(Paycheck paycheck) {
		this.paychecks.add(paycheck);
	}

}
