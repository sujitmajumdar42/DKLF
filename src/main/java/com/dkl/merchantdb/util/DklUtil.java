package com.dkl.merchantdb.util;

import java.sql.Date;

public class DklUtil {
	public static void main(String a[]) {
		Date sqlDate = new Date(new java.util.Date().getTime());
		System.out.println(sqlDate);
	}
	public static Long getID(){
		return System.currentTimeMillis()%1000000;
	}
	public static String getLedgerID(){
		return "LEDG"+getID();
	}
	
	public static String getCompID(){
		return "COMP"+getID();
	}
	
	public static String getCityID(){
		return "City"+getID();
	}
	
	public static String getTodayDate(){
		return new Date(new java.util.Date().getTime()).toString();
	}
}
