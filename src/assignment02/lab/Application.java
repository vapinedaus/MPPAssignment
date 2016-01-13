package assignment02.lab;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Application {

	public Application() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Company comp = new Company ("Microsoft");
		
		Department ITdept = new Department("IT Department", "Tower 1 Level 1");

		  Position CEO = new Position("Supervisor","surpervising");
		  Position PM = new Position("Project Manager","Managing the Department/ Projects");
		  Position SE =  new Position("Software Engineer","Develop program");
		
		    ITdept.positions.add(CEO);
		    ITdept.positions.add(SE);
		    ITdept.positions.add(PM);
		    
		    
			DateFormat formatter = new SimpleDateFormat("dd-MMM-yy"); 
			Employee joseph = new Employee( 1,"Joseph","D","Lerman",formatter.parse("11-May-84"),"123456", 55000,CEO);
		    Employee victor = new Employee( 1,"Victor","D","Pineda",formatter.parse("11-May-84"),"123456", 5000,SE);
		    Employee jennyfer = new Employee( 2,"Jennyfer","D","Hubac",formatter.parse("11-May-84"),"123456", 5000,PM);
		    Employee tinbit = new Employee( 3,"Tinbit","D","Cher",formatter.parse("11-May-84"),"123456", 5000,SE);
		    
		    PM.employees.add(jennyfer);
		    SE.employees.add(victor);
		    SE.employees.add(tinbit);
		    CEO.employees.add(joseph);

		    comp.departments.add(ITdept);
		    
		Department Accountingdept = new Department("Accounting Department", "Tower 1 Level 2");
	
			  Position Auditor = new Position("Auditor","Auditing");
			  Position Accountant = new Position("Accountant","Ledger");
			  Position Assistant =  new Position("Assistant","Accounting assistant");
			
			  Accountingdept.positions.add(Auditor);
			  Accountingdept.positions.add(Accountant);
			  Accountingdept.positions.add(Assistant);
			    

			    Employee bon = new Employee( 4,"Bon","D","Pineda",formatter.parse("11-May-84"),"123456", 5000,Auditor);
			    Employee ban = new Employee( 5,"Ban","D","Hubac",formatter.parse("11-May-84"),"123456", 5000,Accountant);
			    Employee bin = new Employee( 6,"Bin","D","Cher",formatter.parse("11-May-84"),"123456", 5000,Assistant);
			    
			    Auditor.employees.add(bon);
			    Accountant.employees.add(ban);
			    Assistant.employees.add(bin);
         
			   comp.departments.add(Accountingdept);
			   
			   comp.print();
			   comp.getSalary();
	
		
		
	}

}
