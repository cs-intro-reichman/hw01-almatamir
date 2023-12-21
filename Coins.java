/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
	  int cents = Integer.parseInt(args[0]);
      int quarter= cents/4;
      int remains= cents%4;
      System.out.println("the maximum amount of quarters coins for "+ cents+ " cents is: "+quarter);
      System.out.println("there are "+ remains+ " cents coins left");


	}
}