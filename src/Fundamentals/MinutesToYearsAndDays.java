package Fundamentals;

public class MinutesToYearsAndDays {
   public static void printYearsAndDays(long minutes) {
	  if (minutes < 1) {
		 System.out.println("Invalid Value");
		 return;
	  }
	  long years = minutes / (60 * 24 * 365);
	  long days = (minutes - years * 60 * 24 * 365) / (60 * 24);
	  System.out.println(minutes + " min = " + years + " y and " + days + " d");
   }
}
