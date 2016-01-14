package assignment3;

public class UPS extends APackage{
	
	public UPS( String packageDescription, double weight, String zone) {
		super(packageDescription, weight, zone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double caculatePrice() {
		// TODO Auto-generated method stub
		double rate = 0.45 * weight;
		return rate - (rate * getDiscount());
		
	}
	
	
	

}
