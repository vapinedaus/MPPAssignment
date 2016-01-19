package assignment05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateRange {

	
	private Calendar startDate; 
	private Calendar endDate;
	public DateRange()
	{
		
	}
	public DateRange(Calendar startDate,Calendar endDate ) {
		this.startDate=startDate;
		this.endDate=endDate;
	}
	
	
	public boolean isInRange(Date date )
	{
		
		Calendar cdate =  Calendar.getInstance();
		cdate.setTime(date);
		if (cdate.compareTo(startDate) >=0  && cdate.compareTo(endDate)<=0)
		{
			return true;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		
		Date dStartDate = startDate.getTime(); 
		Date dEndDate = endDate.getTime();   
		SimpleDateFormat format = new SimpleDateFormat("M/d/yy");

		return "from " + format.format(dStartDate) + " to " + format.format(dEndDate) ;
	}
	
	public static Date getFirstDayOfTheMonth(Date date) throws ParseException
	{
		Calendar cal =  Calendar.getInstance();
		cal.setTime(date);
		int firstday = cal.getActualMinimum(Calendar.DAY_OF_MONTH);
		cal.set(Calendar.DAY_OF_MONTH, firstday);
		
		return cal.getTime();
		
	}
	
	public static Date getLastDayOfTheMonth(Date date)
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int lastDate = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        cal.set(Calendar.DAY_OF_MONTH, lastDate);
		return cal.getTime();
	}
	
	

}
