package Credit01;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

	

	public static void main(String[] args) throws ParseException {
		
		//Generic 
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); 
		
		//Create Customer
		ACustomer corpCust = new CorporateCust("Victor","California","389-787-8900");
		//Create Order
		Order order = new Order("1234",formatter.parse("14-01-2016"));
		//Create orderline
		
		
		//order.addOrderline(orderline);
		//corpCust.createOrder();
		
		
		
		
		
		ACustomer PersonalCust = new PersonalCust("Jennyfer","Iowa","389-787-8900");
	}

}
