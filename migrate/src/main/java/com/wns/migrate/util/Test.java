package com.wns.migrate.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test {

	public static void main(String[] args) {
		String dateInString = "99991231";
		LocalDate date;
		try {
			date = LocalDate.parse(dateInString, DateTimeFormatter.BASIC_ISO_DATE);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println(date);

	}

}
