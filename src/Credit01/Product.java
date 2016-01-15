package Credit01;

public class Product implements IProduct {

	//association
	ICompPoints compPoints;
	public void setCompPoints(ICompPoints compPoints)
	{
	   this.compPoints=compPoints;	
	}
	
	//attributes
	private String description;
	private String productnumber;
	private double price;
	
	
	//constructor
	public Product(String description, String productnumber,double price) {
		this.description= description;
		this.productnumber=productnumber;
		this.price=price;
		
	}

	
	//method
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
