package webdriverutility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaUtility {

public String getSystemDateTime(int day)
{
	Date date=new Date();
	SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-DD");
	Calendar cal = sdf.getCalendar();
	sdf.format(date);
	cal.add(Calendar.DAY_OF_MONTH, day);
	String time = sdf.format(cal.getTime());
	return time;

}

public String getDate()
{
	String date = new Date().toString().replace(" ", "_").replace(":","_");
	return date;
}
}
