package Credit01;

import java.text.SimpleDateFormat;
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
		Date date = this.order.getOrderdate();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, 30);
		//Shipdate
		shipdate = cal.getTime();
		
		
		
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
	
	public void printOrderLineItem()
	{
		
	    Product product = (Product) products.get(0);
	    String stockMessage="";
	    if (!product.isInstock())
	    {
	    	SimpleDateFormat format = new SimpleDateFormat("MM-DD-YY");
	    	stockMessage = " - Shipping Date: " + format.format(shipdate) ;
	    	setStatus("OUT OF STOCK");
	    }
	    else
	    {
	    	setStatus("ON DELIVERY");
	    	stockMessage = "";
	    	
	    }
		System.out.printf(this.quantity +"\t" + product.getProductnumber()+"\t" + product.getDescription() + "("  + computePoints() +  "pt)"+ "\t\t$ %,.2f\t" + status + stockMessage+ "\n" , computePrice());
		
	}
	
	
	public void setStatus(String status) {
		this.status = status;
	}

}
