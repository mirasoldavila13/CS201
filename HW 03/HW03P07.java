import java.util.Scanner;
public class HW03P07 {
	public static void main(String[] args) {
		//generate two values between 0 and 100
		int number1 = 0 + (int)(Math.random() * (100 - 0) + 1);
		int number2 = 0 + (int)(Math.random() * (100 - 0) + 1);
	
		//present a menu to the user
		System.out.println("Math Tutor Menu");
		System.out.println("1. Addition Problem");
		System.out.println("2. Subtraction Problem");
		System.out.println("3. Multiplication Problem");
		System.out.println("4. Random Problem");
	
		//create a Scanner
		Scanner input = new Scanner(System.in);
		//ask user to enter which problem they desire to do
		System.out.print("\n Enter your choice:");
	
		//recieve answer from the user
		int choice = input.nextInt();
	
		if (choice == 4) {
			choice = (int)(Math.random() * 3) + 1;
		}
			
		switch (choice) {
			case 1: System.out.print("What is " + number1 + " + " + number2 + "? ");
				int answerForAddition = input.nextInt(); //ask user for the sum of the two numbers
				boolean additionCorrectAnswer = (number1 + number2 == answerForAddition);
				System.out.println(
				number1 + " + " + number2 + " = " + answerForAddition + " is " +  additionCorrectAnswer);
				break;
			case 2: System.out.print("What is " + number1 + " - " + number2 + "? ");
				int answerForSubtraction = input.nextInt(); //ask user for the difference of the two numbers
				boolean subtractionCorrectAnswer = (number1 - number2 == answerForSubtraction);
				System.out.println(
				number1 + " - " + number2 + " = " + answerForSubtraction + " is " + subtractionCorrectAnswer);
				break;
			case 3: System.out.print("What is " + number1 + " * " + number2 + "? ");
				int answerForProduct = input.nextInt(); //ask user for the product of the number
				boolean productCorrectAnswer = (number1 * number2 == answerForProduct);
				System.out.println(
				number1 + " * " + number2 + " = " + answerForProduct + " is " + productCorrectAnswer);
				break;
			
		}
	
	
	}
}