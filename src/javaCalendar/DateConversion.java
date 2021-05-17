package javaCalendar;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateConversion {

	private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

	/**
	 * method to convert a String to a LocalDateTime format date 
	 * @param date as a String
	 * @return the date converted as LocalDateTime
	 * 
	 */
	public static LocalDateTime StringToLDT(String date) {
		return LocalDateTime.parse(date, formatter);
	}

	/**
	 * method to convert a LocalDateTime format date into a String 
	 * @param date as LocalDateTime
	 * @return the date converted as a String 
	 * 
	 */
	public static String LDTToString(LocalDateTime date) {
		return date.format(formatter); 
	}
}

