package Credit01;

import java.text.DecimalFormat;
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
		
		
		
		
		products = new ArrayList<IProduct>();
		Product item = (Product)product;
		for (int x=1; x<= this.quantity; x++)
		{
			products.add(item);
			
			price = price + item.getPrice();
			points= points +item.getCompPoints().getPoints();
		}
		
		
	}
	
	
	public Date getShipdate() {
		return shipdate;
	}


	public void setShipdate(Date shipdate) {
		this.shipdate = shipdate;
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
	
	public String getOrderLineItem()
	{
		
	    Product product = (Product) products.get(0);
	    if (!product.isInstock())
	    {
	    	SimpleDateFormat format = new SimpleDateFormat("MM-DD-YY");
	    	setStatus("OUT OF STOCK");
	    	order.setStatus("PENDING SHIPMENT");
	    }
	    else
	    {
	    	setStatus("IN STOCK");
	    	
	    }
	    
	    DecimalFormat formatDec = new DecimalFormat(",###,###.00");
		
	    return this.quantity +"\t" + product.getProductnumber()+"\t" + product.getDescription() + "("  + computePoints() +  "pt)"+ "\t\t$ "+formatDec.format(computePrice())+"\t" + status + "\n"; 
		
	
		
	}
	
	
	public void setStatus(String status) {
		this.status = status;
	}

}
