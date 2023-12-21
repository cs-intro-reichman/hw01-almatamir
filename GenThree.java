/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
	  double a =  Double.parseDouble(args[0]);
      double b = Double.parseDouble(args[1]);
      double min1= Math.min(a,b);
      double max= Math.max(a,b);
      double r = (Math.random()*(min1-max+1)+max);
      double r2 = (Math.random()*(min1-max+1)+max);
      double r3 = (Math.random()*(min1-max+1)+max);
      double min= Math.min(r,Math.min(r2,r3));
      System.out.println(r+", "+r2+", "+r3+" the minimum random number is: "+ min);	
	}
}
