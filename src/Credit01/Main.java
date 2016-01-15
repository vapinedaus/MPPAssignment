package Credit01;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

	public static  ArrayList<IProduct> inventory = new ArrayList<IProduct>();
	
	public static IProduct SearchInventory(String productnumber)
	{

	   for (IProduct item : inventory )
	   {
		   Product product =  (Product)item;
		   if (product.getProductnumber() == productnumber)
		   {
			   return product;
		   }
	   }
		return null;
	}

	

	public static void main(String[] args) throws ParseException {
		
		//Create list of products
		inventory.add(new Product("Laptop", "1", 200.00,true, new ComputerPoints()));
		inventory.add(new Product("Notebook", "2", 200.00,false, new ComputerPoints()));
		inventory.add(new Product("Headset", "3", 200.00,true, new Audio_VideoPoints()));
		inventory.add(new Product("Vitamin C", "4", 200.00,true, new HealthPoints()));
		inventory.add(new Product("Oil", "5", 200.00,true, new OtherPoints()));
		
		//Generic 
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); 
		
		//Create Customer
		ACustomer corpCust = new CorporateCust("Victor","California","389-787-8900");
		
		//Create Order (orderid, date)
		Order order = new Order("1",formatter.parse("14-01-2016"));
		
		//Create orderline (qty, product, order)
		Orderline firstOrder = new Orderline(5,SearchInventory("1"),order);
		Orderline secondOrder = new Orderline(1,SearchInventory("2"),order);
		Orderline thirdOrder = new Orderline(10,SearchInventory("3"),order);
		Orderline forthOrder = new Orderline(20,SearchInventory("4"),order);
		Orderline fifthOrder = new Orderline(20,SearchInventory("5"),order);
		order.addOrderline(firstOrder);
		order.addOrderline(secondOrder);
		order.addOrderline(thirdOrder);
		order.addOrderline(forthOrder);
		order.addOrderline(fifthOrder);
		order.addOrderline(firstOrder);
		corpCust.createOrder(order);
		
		
		
		
		
		//ACustomer PersonalCust = new PersonalCust("Jennyfer","Iowa","389-787-8900");
	}

}
