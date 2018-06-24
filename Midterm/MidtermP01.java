import java.util.Scanner;
public class MidtermP01 {
	public static void main(String[] args){
	
		// option 1 : Calculate The Area of a Cirlce
		System.out.println("1. Calculate the Area of a Circle");
		// option 2: Calculate the Area of a Triangle
		System.out.println("2. Calculate the Area of a Triangle");
		// option 3: Quit
		System.out.println("3. Quit");
	
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your Choice: ");
	
		//recieve users input
		double choice = in.nextDouble();
	
		if(choice >= 3) {
			System.out.println("Program will now Quit!");
			System.exit(1);
		}
	
		if(choice == 1) {
			System.out.print("What is the radius of a circle ");
			double radius = in.nextDouble(); //receive users input
			final double PI = 3.14159;
			double areaOfCircle = PI * radius * radius;
			System.out.println("The Area of the Circle is: " + areaOfCircle);
		}
		
		else {
			System.out.print("What is the base of a Triangle? ");
			double base = in.nextDouble(); //receive users input
			System.out.print("What is the height of a Triangle? ");
			double height = in.nextDouble(); // recieve users input
		 
			double areaOfTriangle = (1/2.0) * base * height;
			System.out.println("The base and height of the Triangle is: " + areaOfTriangle);
		}
 
 
	}
}