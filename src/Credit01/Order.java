package Credit01;

import java.util.*;

public class Order {

	//association
	private ICustomer customer;
	public void setCustomer(ICustomer customer)
	{
	   this.customer=customer;	
	}
	
	ArrayList<Orderline> orderlines;
	public void addOrderline(Orderline orderline)
	{
		orderlines.add(orderline);
	}
	
	
	//attributes
	private String ordernumber;
	private boolean prepaid;
	private double orderprice;
	private Date orderdate;
	private String status;
	
	//constructor
	public Order(String ordernumber,boolean prepaid,double orderprice,Date orderdate,String status) {
		this.ordernumber=ordernumber;
		this.prepaid= prepaid;
		this.orderprice=orderprice;
		this.orderdate=orderdate;
		this.status=status;
		
		orderlines = new ArrayList<Orderline>();
		
	}
	
	//methods
	public double getTotalPrice()
	{
		return 0;
	}
	
	public boolean getPrepaid()
	{
		return false;
	}
	
	private double customerPoint;
	public double getCustomerPoint()
	{
		return customerPoint;
	}
	
	public void setCustomerPoint(double customerPoint)
	{
		this.customerPoint= customerPoint;
	}
	
	
	public double getOrderPoint()
	{
		return 0;
	}
	
	
	

	
	
	
	
	
}
