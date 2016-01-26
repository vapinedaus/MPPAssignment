package assignment08;

public class RegularExpressionTest {

	public RegularExpressionTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
      System.out.println("========================Plate No===========================");
	  String licensePattern = "[A-Z]{2}[0-9]{4}[A-Z]{3}";
	  String strPlateNo1= "VA5678CAM";
	  String strPlateNo2= "XXX5678CA";
	  System.out.println("Is "+ strPlateNo1 +" a valid plate number: " + strPlateNo1.matches(licensePattern));
	  System.out.println("Is "+ strPlateNo2 +" a valid plate number: " + strPlateNo2.matches(licensePattern));
	  
	  
	  System.out.println("\n=========================Replace===========================");
	  String eight = "eight";
	  String countStr ="123456789101112131415161718";
	  System.out.println("Initial value: " + countStr);
	  System.out.println("Replaced value: " + countStr.replaceAll("[8]", eight));


	}

}
