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
	public double getOrderprice() {
		return orderprice;
	}

	public void setOrderprice(double orderprice) {
		this.orderprice = orderprice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setPrepaid(boolean prepaid) {
		this.prepaid = prepaid;
	}
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
