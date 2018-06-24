package homework;
import java.util.Scanner;
public class HW05P02 {

	public static void main(String[] args) {
		double score1;
		double score2;
		double score3;
		double score4;
		double score5;
		//create a scanner
		Scanner input = new Scanner(System.in);
		
		//ask the user to enter their five scores
		System.out.print("Enter five test scores!: ");
		score1 = input.nextDouble();
		score2 = input.nextDouble();
		score3 = input.nextDouble();
		score4 = input.nextDouble();
		score5 = input.nextDouble();
		
		 mean(score1, score2, score3, score4, score5);

	}
	
	//create a method that returns the lowest of the five scores 
	public static double lowestScore(double score1, double score2, double score3, double score4, double score5){//Don't use void
		double lowest = Math.min(score1, Math.min(score2, score3));
		double lowestScore = Math.min(lowest, Math.min(score4, score5));
		//return the lowest score
		return lowestScore;
	}

	
	//create  a method that calculates the average and shows the four highest scores
		public static void mean(double score1, double score2, double score3, double score4, double score5){
			double x = lowestScore(score1, score2, score3, score4, score5);
			
			//declare a variable
			double sumOfScores;
			double mean;
		
			//initialize it to the mean formula
			
			sumOfScores = score1 + score2 + score3 + score4 + score5;
			mean = (sumOfScores - x) /4.0;
			
			// return the average of the four highest scores
			System.out.println("The average of the four highest scores is: " + mean);
		}
	
}
