package Credit01;

import java.util.*;

public class Orderline {

	//assocition
	private Order order;
	public  void setOrder(Order order)
	{
		this.order=order;
	}
	
	private ArrayList<IProduct> products;
	public  void addProduct(IProduct product)
	{
		products.add(product);
	}
	
	//atributes
	private int quantity;
	private double price;
	private String status;
	private Date shipdate;
	private double points;
	
	
	
	//constructor
	public Orderline(int quantity,double price,String status,Date shipdate,double points) {
		this.quantity=quantity;
		this.price=price;
		this.status=status;
		this.shipdate=shipdate;
		this.points=points;
		
		products = new ArrayList<IProduct>();
		
	}
	
	
	//methods
	public double computePrice()
	{
		return 0;
	}
	
	public double computePoints()
	{
		return 0;
	}

}
