import java.util.Scanner;
public class HW03P03 {
	public static void main(String[] args) {
	//declare root1 and root2 as a double type
	double root1;
	double root2;
	
	//create Scanner
	Scanner in = new Scanner(System.in);
	
	//ask the user to input values for a , b, c, and recieve input from user.
	System.out.print("Enter a value for a: ");
	double a = in.nextDouble();
	System.out.print("Enter a value for b: ");
	double b = in.nextDouble();
	System.out.print("Enter a value for c: ");
	double c = in.nextDouble();
	
	////Finds the square root of (b^2 - 4ac) and then the power of the b
	double discriminant = Math.sqrt(Math.pow(b, 2) - (4 * a * c));
	
    root1 = (-b + discriminant) / (2 * a);
	root2 = (-b - discriminant) / (2 * a);
	
	//determine if the discriminant is greater than, equal to zero or if it has a negative number
	//if the discriminant is negative then the equation has no real root
	if (discriminant > 0) {
		System.out.print("The roots are " + root1 + " and " + root2);
	}
	else if (discriminant == 0){
		System.out.print("The root is " + root1);
	}		
	else {
		System.out.print("The equation has no real roots.");
	}
		
	
	}
}