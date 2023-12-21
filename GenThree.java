/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
	  int a =  Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      int min= Math.min(a,b);
      int max= Math.max(a,b);
      int r = (int) (Math.random()*(max - min) + min);
      int r2 = (int) (Math.random()*(max - min) + min);
      int r3 = (int) (Math.random()*(max - min) + min);
      int minr= Math.min(r,Math.min(r2,r3));
      System.out.println(r);
      System.out.println(r2);
      System.out.println(r3);
      System.out.println("the minimal number that was generated is:" + minr);
      

	}
}
