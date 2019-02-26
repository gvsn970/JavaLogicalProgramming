package com.nexiilabs.sample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = formatter.format(date);
		System.out.println("Date Format with MM/dd/yyyy : " + strDate);
		formatter = new SimpleDateFormat("MMMM dd yyyy hh:mm:ss");
		strDate = formatter.format(date);
		System.out.println("Date Format with dd MMMM yyyy zzzz : " + strDate);
	}
}
