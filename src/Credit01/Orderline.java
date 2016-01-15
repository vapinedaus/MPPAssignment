package Credit01;

import java.util.*;

public class Orderline {

	//assocition
	private Order order;
	private ArrayList<IProduct> products;

	
	//atributes
	private int quantity ;
	
	private double price;
	private String status;
	private Date shipdate;
	private double points;
	
	
	
	//constructor
	public Orderline(int quantity,IProduct product, Order order) {
		this.quantity=quantity;
		this.order= order;
		
		products = new ArrayList<IProduct>();
		Product item = (Product)product;
		for (int x=1; x<= this.quantity; x++)
		{
			products.add(item);
			
			price = price + item.getPrice();
			points= points +item.getCompPoints().getPoints();
		}
		
		
	}
	
	
	//methods
	public double computePrice()
	{
		return price;
	}
	
	public double computePoints()
	{
		return points;
	}

}
