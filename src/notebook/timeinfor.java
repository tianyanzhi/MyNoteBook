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
   
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// �������ڸ�ʽ
    String temptime =df.format(new Date()).toString();
    String temptime2=(month+"��"+day+"��  "+hour+"ʱ"+min+"��");
   
}
