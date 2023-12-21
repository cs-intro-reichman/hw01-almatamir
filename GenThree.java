/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
	  int a =  Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      int min1= Math.min(a,b);
      int max= Math.max(a,b);
      int r = (int) (Math.random()*(max - min1) + min1);
      int r2 = (int) (Math.random()*(max - min1) + min1);
      int r3 = (int) (Math.random()*(max - min1) + min1);
      int min= Math.min(r,Math.min(r2,r3));
      System.out.println("For input string: "+ r + ", " + r2 ", " + r3 + "the minimum random number is: " + min);	
	}
}
