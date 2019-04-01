package com.nexiilabs.sample;

import java.time.LocalTime;
import java.util.Calendar;

public class WorikngDays {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();

		String[] strDays = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thusday", "Friday", "Saturday" };
		// Day_OF_WEEK starts from 1 while array index starts from 0
		String day = strDays[now.get(Calendar.DAY_OF_WEEK) - 1];
		System.out.println("Current day is : " + strDays[now.get(Calendar.DAY_OF_WEEK) - 1]);
		String time = LocalTime.now().getHour() + ":" + LocalTime.now().getMinute();
		int hour = LocalTime.now().getHour();
		int minutes = LocalTime.now().getMinute();
		System.out.println("Current Time "+":"+hour+":"+minutes);

		if (day == strDays[0] || day == strDays[6]) {
			if (17 <= hour && 0 <= minutes || hour < 8 && minutes >= 0) {
				System.out.println("Not Working Days Time Out (Sat To Sunday)");
			}else {
				System.out.println("Working DayS (Sat To Sunday)");
			}

		} else {

			if (20 <=hour && 0 <= minutes || hour < 8 && minutes >= 0) {
				System.out.println("Not Working Day Time Out(Mon To Fri)");
			} else {
				System.out.println("Worikng Day Mon To Fri");
			}
		}
	}
}