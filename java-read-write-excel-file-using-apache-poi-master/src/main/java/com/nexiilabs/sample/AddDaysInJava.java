package com.nexiilabs.sample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AddDaysInJava {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date startdate = new Date();
		System.out.println("Today Date : "+sdf.format(startdate));
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, 80);
		String newDate = sdf.format(c.getTime());
		System.out.println("After 80 Days Date : " + newDate );

	}
}
