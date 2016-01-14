package assignment3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Application {

	public Application() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
			
			System.out.println("Number of Package(s):");
			int numberOfPackage= getInt();
			
			ArrayList<APackage> packages = new ArrayList<APackage>();
			
			for (int x=1; x<=numberOfPackage ; x++)
			{
				System.out.println("*********Enter Package " + x +"******");
				System.out.println("Enter Description:");
				String packageDescription = getString();
				System.out.println("Enter Weight in pounds:");
				double  weight= getDouble();
				System.out.println("Enter Zone:");
				String zone = getString();
				
				
				double lowestPrice = 0;
				
				APackage item = new UPS(packageDescription,weight,zone);
				lowestPrice = item.caculatePrice();
				
				
				if (lowestPrice > new FedEx(packageDescription,weight,zone).caculatePrice())
				{
					item = new FedEx(packageDescription,weight,zone);
					lowestPrice = item.caculatePrice();
				} 
				
				if (lowestPrice > new USMail(packageDescription,weight,zone).caculatePrice())
				{
					item = new USMail(packageDescription,weight,zone);
					lowestPrice = item.caculatePrice();
				}
				packages.add(item);
				
				
				
			}
			
			System.out.print("--------------------------------n");
			for (APackage packItem: packages)
			{
			   
			   System.out.printf(packItem.packageDescription + "\t$%,.2f" + "\t" +  packItem.getClass().getSimpleName() +"\n"  , packItem.caculatePrice());
			}
			System.out.print("--------------------------------n");
        

	}
	
	

	  public static String getString() throws IOException  //reads a string from the keyboard input
      {
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      String s = br.readLine();
      return s;
      }
	  
	  public static double getDouble() throws IOException  //reads a string from the keyboard input
      {
   
      String s = getString();
      return  Double.parseDouble(s) ;
      }
	  
	  public static int getInt() throws IOException  //reads a string from the keyboard input
      {
		  String s = getString();
	      return  Integer.parseInt(s);
      }
}
