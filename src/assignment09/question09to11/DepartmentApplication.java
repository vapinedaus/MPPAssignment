package assignment09.question09to11;

import java.io.*;                 // for I/O
import java.lang.Integer;  
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * This is a skeleton class that you can use for guidance in starting the lab.
 *
 * You should update any comments,
 * variable names, etc to follow the class coding conventions.
 */

public class DepartmentApplication
   {
   public static void main(String[] args) throws IOException, ParseException
      {
      
	   System.out.println("***************************Interface Test*********************************");
	   Person person = new Person();
	   person.myDefault();
	   IPerson.myStatic();
	   
	   System.out.println("***************************Enum Test*********************************");
	   System.out.println(studentLevel.freshman);
	   System.out.println(studentLevel.sophomore);
	   System.out.println(studentLevel.junior);
	   System.out.println(studentLevel.senior);
		

      }
// -------------------------------------------------------------
   }  // end class 
