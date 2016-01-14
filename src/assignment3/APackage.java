package assignment3;

public abstract class APackage implements IPackage {

	
	
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

}
