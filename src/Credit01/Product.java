package Credit01;

public class Product implements IProduct {

	//association
	private ICompPoints compPoints;

	public ICompPoints getCompPoints() {
		return compPoints;
	}




	//attributes
	private String description;
	private String productnumber;
	private double price;
	
	//new
	private boolean instock;
	public String getProductnumber() {
		return productnumber;
	}
	
	
	//constructor
	public Product(String description, String productnumber,double price,boolean instock,ICompPoints compPoints) {
		this.description= description;
		this.productnumber=productnumber;
		this.price=price;
		this.instock=instock;
		
		this.compPoints=compPoints;	
		
	}

	
	//method
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	public String getDescription() {
		return description;
	}




	public boolean isInstock() {
		return instock;
	}


	


	

}
