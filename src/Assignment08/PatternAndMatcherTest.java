package Assignment08;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcherTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
      System.out.println("========================Plate No===========================");
      
	  Pattern licensePattern = Pattern.compile("[A-Z]{2}[0-9]{4}[A-Z]{3}");
	  Matcher matcher1 = licensePattern.matcher("VA5678CAM");
      Matcher matcher2 = licensePattern.matcher("XXX5678CA");
	  System.out.println("Is VA5678CAM a valid plate number: " + matcher1.matches());
	  System.out.println("Is XXX5678CA a valid plate number: " + matcher2.matches());
	  
	  
	  System.out.println("\n=========================Replace===========================");
	  Pattern pattern =  Pattern.compile("[8]");
	  String countStr ="123456789101112131415161718";
	  Matcher matcher = pattern.matcher(countStr);
	  System.out.println("Initial value: " + countStr);
	  System.out.println("Replaced value: " + matcher.replaceAll("eight"));

	  
	}
}
