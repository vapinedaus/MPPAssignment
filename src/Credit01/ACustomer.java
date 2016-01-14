package Credit01;

public abstract class ACustomer implements ICustomer  {

	//Association
	private Order order;
	public  void setOrder(Order order)
	{
		this.order=order;
	}
	
	//Attributes
	private String name;
	private String address;
	private String phone;
	private double points;
	
	//Constructor
	public ACustomer( String name,String address,String phone,double points) 
	{
		this.name=name;
		this.address=address;
		this.phone=phone;
		this.points=points;
		
	}

	//Methods
	public abstract CreditRating getCreditRating(); 
	

}
