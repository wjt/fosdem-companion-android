package be.digitalia.fosdem.api;

import java.util.Locale;

/**
 * This class contains all FOSDEM Urls
 * 
 * @author Christophe Beyls
 * 
 */
public class FosdemUrls {

	//private static final String SCHEDULE_URL = "https://fosdem.org/schedule/xml";
	private static final String SCHEDULE_URL = "https://archive.fosdem.org/2013/schedule/xml";
	private static final String EVENT_URL_FORMAT = "https://fosdem.org/%1$d/schedule/event/%2$s/";
	private static final String PERSON_URL_FORMAT = "https://fosdem.org/%1$d/schedule/speaker/%2$s/";

	private static int year;

	public static void setYear(int year) {
		FosdemUrls.year = year;
	}

	public static String getSchedule() {
		return SCHEDULE_URL;
	}

	public static String getEvent(String slug) {
		return String.format(Locale.US, EVENT_URL_FORMAT, year, slug);
	}

	public static String getPerson(String slug) {
		return String.format(Locale.US, PERSON_URL_FORMAT, year, slug);
	}
}
