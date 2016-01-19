package assignment05;

import java.util.ArrayList;

public class Hourly extends Employee {

	
	private double hourlyWage;
	private int hoursPerWeek;
	public Hourly(int empID, double hourlyWage,int hoursPerWeek) {
		super(empID);
		this.hourlyWage=hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
		
	}

	@Override
	public double calcGrossPay(DateRange daterange) {
		
		return hourlyWage * (hoursPerWeek * 4);
	}

}
