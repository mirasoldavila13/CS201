//Ask the user to enter the speed of the car in miles per hour and then display the distance the car will travel in 5, 
//10, and 15 hours.
import java.util.Scanner;
public class HW02P01 {
	public static void main(String[] args){
		int timeOne = 5;
		int timeTwo = 10;
		int timeThree = 15;
		int speedOfCar;
		int distanceOne;
		int distanceTwo;
		int distanceThree;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the speed of the car (mph):");
		speedOfCar = in.nextInt();
		distanceOne = speedOfCar * timeOne;
		distanceTwo = speedOfCar * timeTwo;
		distanceThree = speedOfCar * timeThree;
		System.out.println("Time (hours)    Distance (miles)");
		System.out.println("-------------------------------- ");
		System.out.println("" + timeOne + "               " + distanceOne);
		System.out.println("" + timeTwo + "              " + distanceTwo);
		System.out.println("" + timeThree + "              " + distanceThree);
		
	}
}