/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
	  int side1 = Integer.parseInt(args[0]);
      int side2 = Integer.parseInt(args[1]);
      int side3 = Integer.parseInt(args[2]);
      int min=side1;
      boolean stop=true;
      while(stop==true)
      {
        if(min<side2+side3)
        {
            min=side2;
            if(min<side1+side3)
            {
                  min=side3;
                  if(min<side1+side2)
                  {
                        return true;
                  }
                  return false;
               
            } return false;
            
        } return false;
            
      } return false;
	}
}
