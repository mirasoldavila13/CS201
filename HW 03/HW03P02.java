import java.util.Scanner;
public class HW03P02 {
	public static void main(String[] args) {
		//declare the values for x and y
		double x;
		double y;
		
		//create a Scanner
		Scanner input = new Scanner(System.in);
		
		// asks the user to enter a, b, c, d, e, and f and recieve the input of the user
		System.out.print("Enter a value for a: ");
		double a = input.nextDouble();
		
		System.out.print("Enter a value for b: ");
		double b = input.nextDouble();
		
		System.out.print("Enter a value for c: ");
		double c = input.nextDouble();
		
		System.out.print("Enter a value for d: ");
		double d = input.nextDouble();
		
		System.out.print("Enter a value for e: ");
		double e = input.nextDouble();
		
		System.out.print("Enter a value for f: ");
		double f = input.nextDouble();
		
							
		
		//input what we recieve from the users input and input them into the linear equation formula
		//declare the denominator, xnumerator, ynumerator as a double type
		//using this formula we can get the output for x and y
		double denominator =  (a * d) - (b * c) ;
		double xNumerator = (e * d) - (b * f) ;
		double yNumerator = (a * f) - (e * c) ;
		x =  xNumerator / denominator;
		y =  yNumerator / denominator;
		
		//if the denominator so happen to equal zero then the equation has no solution. 
		//other wise print out x and y
		if ( denominator == 0)	{
			System.out.println("The equation has no solution");
		}
		else {
			System.out.println("x: " + x);
			System.out.println("y: " + y);
		}
		
		
		
	}

}