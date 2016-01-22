package assignment05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {


	public static void main(String[] args) throws ParseException {

		
		Employee salariedEmp = new  Salaried(111, 5000);
		
	    Employee hourlyEmp = new  Hourly(333, 100,56);
	    
	    salariedEmp.AddPaychekcs(salariedEmp.calcCompensation(1, 2016));
	    salariedEmp.AddPaychekcs(salariedEmp.calcCompensation(2, 2016));
	    salariedEmp.AddPaychekcs(salariedEmp.calcCompensation(3, 2016));
	    salariedEmp.AddPaychekcs(salariedEmp.calcCompensation(4, 2016));
	    salariedEmp.AddPaychekcs(salariedEmp.calcCompensation(5, 2016));
	    salariedEmp.AddPaychekcs(salariedEmp.calcCompensation(6, 2016));
	    salariedEmp.AddPaychekcs(salariedEmp.calcCompensation(7, 2016));
	    salariedEmp.AddPaychekcs(salariedEmp.calcCompensation(8, 2016));
	    salariedEmp.AddPaychekcs(salariedEmp.calcCompensation(9, 2016));
	    salariedEmp.AddPaychekcs(salariedEmp.calcCompensation(10, 2016));
	    salariedEmp.AddPaychekcs(salariedEmp.calcCompensation(11, 2016));
	    salariedEmp.AddPaychekcs(salariedEmp.calcCompensation(12, 2016));
	    salariedEmp.print();
	    
	    
	    System.out.print("\n\n\n");
	    
	    hourlyEmp.AddPaychekcs(hourlyEmp.calcCompensation(1, 2016));
	    hourlyEmp.AddPaychekcs(hourlyEmp.calcCompensation(2, 2016));
	    hourlyEmp.AddPaychekcs(hourlyEmp.calcCompensation(3, 2016));
	    hourlyEmp.AddPaychekcs(hourlyEmp.calcCompensation(4, 2016));
	    hourlyEmp.AddPaychekcs(hourlyEmp.calcCompensation(5, 2016));
	    hourlyEmp.AddPaychekcs(hourlyEmp.calcCompensation(6, 2016));
	    hourlyEmp.AddPaychekcs(hourlyEmp.calcCompensation(7, 2016));
	    hourlyEmp.AddPaychekcs(hourlyEmp.calcCompensation(8, 2016));
	    hourlyEmp.AddPaychekcs(hourlyEmp.calcCompensation(9, 2016));
	    hourlyEmp.AddPaychekcs(hourlyEmp.calcCompensation(10, 2016));
	    hourlyEmp.AddPaychekcs(hourlyEmp.calcCompensation(11, 2016));
	    hourlyEmp.AddPaychekcs(hourlyEmp.calcCompensation(12, 2016));
	    hourlyEmp.print();
	    
	    
	    SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
	    
	    

	    Order order1 = new Order(111, format.parse("01-01-2016"), 1000);
	    Order order2 = new Order(111, format.parse("02-22-2016"), 1000);
	    Order order3 = new Order(111, format.parse("10-22-2016"), 1000);

	    
	    Employee commissionedEmp = new  Commissioned( 222, 0.20, 5000)
	    .AddOrders(order1)
	    .AddOrders(order2)
	    .AddOrders(order3);
	 
	    
       System.out.print("\n\n\n");
	    
       commissionedEmp.AddPaychekcs(commissionedEmp.calcCompensation(1, 2016));
       commissionedEmp.AddPaychekcs(commissionedEmp.calcCompensation(2, 2016));
       commissionedEmp.AddPaychekcs(commissionedEmp.calcCompensation(3, 2016));
       commissionedEmp.AddPaychekcs(commissionedEmp.calcCompensation(4, 2016));
       commissionedEmp.AddPaychekcs(commissionedEmp.calcCompensation(5, 2016));
       commissionedEmp.AddPaychekcs(commissionedEmp.calcCompensation(6, 2016));
       commissionedEmp.AddPaychekcs(commissionedEmp.calcCompensation(7, 2016));
       commissionedEmp.AddPaychekcs(commissionedEmp.calcCompensation(8, 2016));
       commissionedEmp.AddPaychekcs(commissionedEmp.calcCompensation(9, 2016));
       commissionedEmp.AddPaychekcs(commissionedEmp.calcCompensation(10, 2016));
       commissionedEmp.AddPaychekcs(commissionedEmp.calcCompensation(11, 2016));
       commissionedEmp.AddPaychekcs(commissionedEmp.calcCompensation(12, 2016));
       commissionedEmp.print();
	    
	 
	    
	
	}

}
