package assignment05;

import java.util.Date;

public class Order {

	
	private int OrderNo;
	public Date getOrderDate() {
		return OrderDate;
	}
	public double getOrderAmount() {
		return OrderAmount;
	}
	private Date OrderDate;
	private double OrderAmount;
	public Order(int OrderNo, Date OrderDate, double OrderAmount) {
		this.OrderNo=OrderNo;
		this.OrderDate=OrderDate;
		this.OrderAmount=OrderAmount;
	}
	
	

}
