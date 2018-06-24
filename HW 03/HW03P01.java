import java.util.Scanner;
public class HW03P01 {
	public static void main(String[] args) {
		int number1;
		int number2;
		int number3;
		
		//create a Scanner
		Scanner in = new Scanner(System.in);
		
		//ask the user to enter three integers
		System.out.print("Enter a sequence of three integers: ");
		
		//recieve input from user
		number1 = in.nextInt();
		number2 = in.nextInt();
		number3 = in.nextInt();
		
		// determine if the three integers are strictly increasing, increasing, strictly decreasing, decreasing or no order
		if (number1 < number2  && number2 < number3) {
			System.out.println("Strictly Increasing");	
		}
		else if (number1 == number2  && number2 < number3) {
			System.out.println("Increasing");
		}
		else if (number1 > number2 && number2 > number3) {
			System.out.println("Strictly Decreasing");
		}
		else if (number1 > number2 && number2 == number3) {
			System.out.println("Decreasing");
		}
		else {
			System.out.println("No Order");
		}
			
		
		
	}


}