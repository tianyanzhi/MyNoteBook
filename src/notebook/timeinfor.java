package notebook;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class timeinfor {

	Calendar cal=Calendar.getInstance();
	  
	
	int month=cal.get(Calendar.MONTH);
	int day=cal.get(Calendar.DAY_OF_MONTH);
	int hour=cal.get(Calendar.HOUR);
	int min=cal.get(Calendar.MINUTE);
   
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
    String temptime =df.format(new Date()).toString();
    String temptime2=(month+"月"+day+"日  "+hour+"时"+min+"秒");
   
}
