package Credit01;

import java.util.ArrayList;

public abstract class ACustomer implements ICustomer  {

	//Association
	private ArrayList<Order> orders;
	public  void createOrder(Order order)
	{
		orders.add(order);
	}
	
	//Attributes
	private String name;
	private String address;
	private String phone;
	private double points;
	
	//Constructor
	public ACustomer( String name,String address,String phone) 
	{
		this.name=name;
		this.address=address;
		this.phone=phone;
		this.orders = new ArrayList<Order>();
		
		
	}

	//Methods
	public abstract CreditRating getCreditRating(); 
	public abstract void setCreditRating(CreditRating creditRating);
	public void printOrders()
	{
      System.out.println("********************************************************************");
	  System.out.println("NAME: \t\t"+ this.name );
	  System.out.println("ADDRESS: \t"+ this.address );
	  System.out.println("PHONE: \t\t"+ this.phone );
	  System.out.println("CREDIT RATING: \t"+ this.getCreditRating() );
	  System.out.println("TYPE: \t\t" + this.getClass().getSimpleName());
	  System.out.println("--------------------------------------------------------------------");

		
		 for ( Order item : orders )
		 {
			 
			 item.printOrder();
		 }
	  System.out.print("\n\n\n");
		
	}

	public double getPoints() {
		return points;
	}

	public void setPoints(double points) {
		this.points = points;
	}

}
