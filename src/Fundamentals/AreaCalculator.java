package Fundamentals;

public class AreaCalculator {
   private static final double INVALID_VALUE_MESSAGE = -1;

   public static void main(String[] args) {
   }

   private static double area(double radius) {
	  if (radius < 1) return INVALID_VALUE_MESSAGE;
	  return radius * radius * Math.PI;
   }

   private static double area(double a, double b) {
	  if (a * b == 0) return INVALID_VALUE_MESSAGE;
	  return a * b;
   }

}
