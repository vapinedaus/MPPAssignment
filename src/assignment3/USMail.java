package assignment3;

public class USMail extends APackage {

	public USMail(String packageDescription, double weight, String zone) {
		super(packageDescription, weight, zone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double caculatePrice() {
		// TODO Auto-generated method stub
		double rate=0;
		if (weight < 3)
		{
			rate= 1;
		}
		else
		{
			rate = 0.55 * weight;
		}
		return rate;
	}

}
