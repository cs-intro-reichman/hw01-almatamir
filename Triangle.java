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
        String false_statement = side1+", "+side2+ ", " + side3+ ": false";
        String true_statement = side1+", "+side2+ ", " + side3+ ": true";
        if (side1 + side2 <= side3) {
            System.out.println(false_statement);
        } else if (side2 + side3 <= side1) {
            System.out.println(false_statement);
        } else if (side1 + side3 <= side2) {
            System.out.println(false_statement);
        } else {
            System.out.println(true_statement);
        }
	}
}
