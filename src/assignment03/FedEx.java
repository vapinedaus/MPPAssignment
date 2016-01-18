package assignment03;

public class FedEx extends APackage {

	
	public FedEx( String packageDescription, double weight, String zone) {
		super(packageDescription, weight, zone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double caculatePrice() {
		// TODO Auto-generated method stub
		
		double rate =0;
		
	switch (zone.toUpperCase())
	{
	case "IA":
	case "MT":
	case "OR":
	case "CA":
		rate = 0.35 * weight;
		break;
	case "TX":
	case "UT":
		rate = 0.30 * weight;
		break;
	case "FL":
	case "MA":
	case "OH": 
		rate = 0.55 * weight;
		break;
	default:
		rate = 0.43 * weight;
		break;
	}
		return rate - (rate * getDiscount());
	}

}
