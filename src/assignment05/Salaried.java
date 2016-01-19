package assignment05;

public class Salaried extends Employee {

	
	private double salary;
	public Salaried(int empID, double salary) {
		super(empID);
		this.salary = salary;
	}

	@Override
	public double calcGrossPay(DateRange daterange) {
		// TODO Auto-generated method stub
		return salary;

	}

}
