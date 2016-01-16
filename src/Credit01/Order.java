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
		return prepaid;
	}
	
	public void setPrepaid(boolean prepaid) {
		this.prepaid = prepaid;
	}
	
	public double getTotalPrice()
	{
		orderprice = 0;
		for (Orderline ol : orderlines)
		{
			orderprice= orderprice + ol.computePrice();
		}
		
		return orderprice - discount;
	}
	
	
	
	
	public double getCustomerPoint()
	{
		ACustomer customerpt = (ACustomer)customer;
		return customerpt.getPoints();
	}
	
	private double discount ;

	public void setCustomerPoint(double orderPoint)
	{
		ACustomer customerpt = (ACustomer)customer;
		
		if ( (customerpt.getPoints()+ orderPoint) >= 25)
		{
			discount = orderprice * 0.40;
			customerpt.setPoints(0);
		}
		else
		{
			discount = 0;
			customerpt.setPoints(customerpt.getPoints() + orderPoint );
		}
		
	
	}
	
	
	
	private double orderPoint;
	public double getOrderPoint()
	{
		orderPoint = 0;
		for (Orderline ol : orderlines)
		{
			orderPoint= orderPoint + ol.computePoints();
		}
		
		return orderPoint;
	}
	
	
	//new 
	public void printOrder()
	{
		System.out.println("OR#: "+ this.ordernumber + "              Date:" + orderdate);
	
		
		System.out.println("QTY \tPrd#\tDescription \t\tPrice\t");
		for (Orderline  item : orderlines)	
		{
			item.printOrderLineItem();
			
		}
		System.out.println("*********************************************************************");

		if ( customer.getCreditRating() == CreditRating.poor) 
		    setPrepaid(true);
	     else
			 setPrepaid(false);
		
		
		if (customer instanceof CorporateCust)
		{
			CorporateCust corpcust = (CorporateCust)customer;
			if (corpcust.getCreditlimit() < getTotalPrice() )
			{
				setPrepaid(true);
			}
			else
			{
				setPrepaid(false);
			}
			
		}
		
		
		
		
		if (getPrepaid())
		{
			System.out.println("***Must be prepaid***");
		}
		else
		{
			System.out.println("***Postpaid is allowed***");
		}
		System.out.printf("GROSS TOTAL:\t\t\t\t\t$ %,.2f\n" ,  getTotalPrice() );
		
		
		ACustomer customerpt = (ACustomer)customer;
		
		
		System.out.printf("CUSTOMER POINTS:\t\t\t\t %.0f pts\n" ,  customerpt.getPoints());
		System.out.printf("ORDER POINTS:\t\t\t\t\t %.0f pts\n" ,  getOrderPoint());
		System.out.printf("TOTAL POINTS:\t\t\t\t\t %.0f pts\n" ,  customerpt.getPoints() + getOrderPoint());
		
		
		setCustomerPoint(orderPoint);
		System.out.printf("Discount:\t\t\t\t\t$ %,.2f\n" ,  discount);
		System.out.printf("NET TOTAL:\t\t\t\t\t$ %,.2f\n" ,  getTotalPrice() );
		
		
		
		System.out.println("--------------------------------------------------------------------");
	}
	
	
	
	public Date getOrderdate() {
		return orderdate;
	}

	
	
	
	
	
}
