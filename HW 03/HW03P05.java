import java.util.Scanner;
public class HW03P05 {
	public static void main(String[] args) {
		//generates a number 0, 1, or 2
		int computer = (int)(Math.random() * 3);
		int rock = 0;
		int paper = 1;
		int scissors = 2;
	
		//ask user to enter a number between 0 - 2
		System.out.print("Enter a number 0, 1, or 2 :");
	
		//Create a scanner 
		Scanner input = new Scanner(System.in);
	
		//recieve input from user	
		int userAnswer = input.nextInt();
	

		//rock can crush a scissors
		if (computer == rock && userAnswer == scissors) {
			   
			System.out.println("     _______");
			System.out.println(" ---'   ____)");
			System.out.println("       (_____)");
			System.out.println("       (_____)");
			System.out.println("       (____)");
			System.out.println(" ---.__(___)");    
			System.out.println("\n Computer Wins!");
			//computer wins 
		}
		else if (computer == scissors && userAnswer == rock) {
			System.out.println("     _______");
			System.out.println(" ---'   ____)");
			System.out.println("       (_____)");
			System.out.println("       (_____)");
			System.out.println("       (____)");
			System.out.println(" ---.__(___)");    
			System.out.println("\n User Win!");
		}
		else if (computer == paper && userAnswer == rock){
			System.out.println("     _______");
			System.out.println(" ---'   ____)____");
			System.out.println("           ______)");
			System.out.println("          _______)");
			System.out.println("         _______)");
			System.out.println(" ---.__________)");
			System.out.println("\n Computer Wins!");
			//paper can wrap a rock 
		}
		else if (computer == rock && userAnswer == paper) {
			System.out.println("     _______");
			System.out.println(" ---'   ____)____");
			System.out.println("           ______)");
			System.out.println("          _______)");
			System.out.println("         _______)");
			System.out.println(" ---.__________)");
			System.out.println("\n User Wins!");
			//user wins
		}
		else if (computer == scissors && userAnswer == paper) {
			System.out.println("    _______");
			System.out.println("---'   ____)____");
			System.out.println("          ______)");
			System.out.println("       __________)");
			System.out.println("      (____)");
			System.out.println("---.__(___)");
			System.out.println("\n Computer Wins!");
			//scissors can cut paper
		}
		else if (computer == paper && userAnswer == scissors) {
			System.out.println("    _______");
			System.out.println("---'   ____)____");
			System.out.println("          ______)");
			System.out.println("       __________)");
			System.out.println("      (____)");
			System.out.println("---.__(___)");
			System.out.println("\n User Wins!");
		}
		else {
			System.out.println("Draw!");
		}
	
	
	
	
	
	}
}