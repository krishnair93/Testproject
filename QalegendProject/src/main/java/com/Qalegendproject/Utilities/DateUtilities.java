package com.Qalegendproject.Utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtilities {
	
	public static String getCurrentDate() {
		
		Date date = new Date();
		SimpleDateFormat sdf =new SimpleDateFormat("MM/dd/yyyy");
		String formatDate = sdf.format(date);
		return formatDate;
		
	}

}
