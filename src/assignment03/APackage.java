package assignment03;

public abstract class APackage implements IPackage, ISender  {

	
	
	String packageDescription;
	double weight;
	String zone;
	
	
	

	public String getPackageDescription() {
		return packageDescription;
	}


	public double getWeight() {
		return weight;
	}


	public String getZone() {
		return zone;
	}


	public APackage(String packageDescription,double weight,String zone)
	{
	
		this.packageDescription =packageDescription;
		this.weight=weight;
		this.zone= zone;
	}



	public abstract double caculatePrice();
	
	@Override
	public double getDiscount() {
		// TODO Auto-generated method stub
		return sender.getSenderDiscount();
	}

	private Sender sender;
	@Override
	public void setSender(Sender sender) {
		// TODO Auto-generated method stub
		this.sender = sender;
	}

}
