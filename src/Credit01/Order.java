package Credit01;

import java.util.*;

public class Order {

	//association
	private ICustomer customer;
	public void setCustomer(ICustomer customer)
	{
	   this.customer=customer;	
	}
	
	private ArrayList<Orderline> orderlines;
	public void addOrderline(Orderline orderline)
	{
		orderlines.add(orderline);
	}
	
	
	//attributes
	private String ordernumber;
	private Date orderdate;
	
	private boolean prepaid;
	private double orderprice;
	

	private String status;
	
	//constructor
	public Order(String ordernumber,Date orderdate) {
		this.ordernumber=ordernumber;
		this.orderdate=orderdate;
		
		orderlines = new ArrayList<Orderline>();
		
	}
	
	//methods
	

	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean getPrepaid()
	{
		return false;
	}
	
	public void setPrepaid(boolean prepaid) {
		this.prepaid = prepaid;
	}
	
	public double getTotalPrice()
	{
		for (Orderline ol : orderlines)
		{
			orderprice= orderprice + ol.computePrice();
		}
		
		return orderprice;
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
	
	
	
	private double orderPoint;
	public double getOrderPoint()
	{
		for (Orderline ol : orderlines)
		{
			orderPoint= orderPoint + ol.computePoints();
		}
		
		return orderPoint;
	}
	
	
	

	
	
	
	
	
}
