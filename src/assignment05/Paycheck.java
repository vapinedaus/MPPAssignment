package assignment05;

import java.text.DecimalFormat;

public class Paycheck {

	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialSecurity;
	private DateRange payperiod;

	public Paycheck( double grossPay,DateRange payperiod) {
		this.grossPay=grossPay;
		this.payperiod=payperiod;
		
		this.fica = grossPay * .23;
		this.state = grossPay * .05;
		this.local = grossPay * .01;
		this.medicare = grossPay * .03;
		this.socialSecurity = grossPay * .075;
		
	}
	
	
	
	public void print()
	{
		
		DecimalFormat format = new DecimalFormat(",###,###.00");
		System.out.println("****************************************************************");
		System.out.println("This paycheck is "  + payperiod.toString());
		System.out.println("Total Grosspay ---------------------------------------- $"  + format.format(this.grossPay));
		System.out.println("Less FICA --------------------------- $"  + format.format(this.fica));
		System.out.println("Less State tax ---------------------- $"  + format.format(this.state));
		System.out.println("Less Local tax ---------------------- $"  + format.format(this.local));
		System.out.println("Less Medicare ----------------------- $"  + format.format(this.medicare));
		System.out.println("Less Social Security ---------------- $"  + format.format(this.socialSecurity));
		System.out.println("Total Netpay ------------------------------------------ $"  + format.format(this.getNetPay()));
	}
	
	public double getNetPay( )
	{
		return  grossPay - (this.fica+ this.state + this.local + this.medicare  + this.socialSecurity);
	}

}
