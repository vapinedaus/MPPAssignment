package assignment05;

import java.util.ArrayList;

public class Commissioned extends Employee {

	
	private double commission;
	private double baseSalary;
	private ArrayList<Order> orders;



	public Commissioned( int empID, double commission, double baseSalary) {
		
		super(empID);
		this.commission = commission;
		this.baseSalary=baseSalary;
		orders = new ArrayList<Order>();
	
	}

	@Override
	public double calcGrossPay(DateRange daterange) {
		// TODO Auto-generated method stub
		
		double orderAmount = 0;
		for(Order order : orders)
		{
			if (daterange.isInRange(order.getOrderDate()))
			{
				orderAmount = orderAmount + order.getOrderAmount();
			}
		}
		
		double totalCommission =0;
		if (orderAmount!=0)
		totalCommission = orderAmount * commission;

		return baseSalary + totalCommission ;
	}
	

	public Commissioned AddOrders( Order order) {
		orders.add(order);
		return this;
	}

}
