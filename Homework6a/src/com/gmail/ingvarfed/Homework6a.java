package com.gmail.ingvarfed;

import java.util.Calendar;

public class Homework6a {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		long msPassed = msSinceMonthAgo(today);
		System.out.println(msPassed + " ms have passed since the same date last month.");
	}
	
	/**
	 * Method calculates how many milliseconds have passed since the same date last month
	 * @param today - the current date
	 * @return Number of milliseconds as a long integer type
	 */
	static long msSinceMonthAgo(Calendar today){
		long msPassed = today.getTime().getTime();
		today.add(Calendar.MONTH, -1);
		msPassed -= today.getTime().getTime();
		return msPassed;
	}
}
