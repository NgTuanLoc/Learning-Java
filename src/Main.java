public class Main {
   public static void main(String[] args) {
	  printConversion(75.114);
   }

   // write your code here
   public static long toMilesPerHour(double kilometersPerHour) {
	  if (kilometersPerHour >= 0) {
		 return Math.round((kilometersPerHour / 1.609));
	  }

	  return -1;
   }

   public static void printConversion(double kilometersPerHour) {
	  long milesPerHour = toMilesPerHour(kilometersPerHour);

	  if (milesPerHour == -1) {
		 System.out.println("Invalid Value");
	  } else {
		 System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
	  }
   }
}