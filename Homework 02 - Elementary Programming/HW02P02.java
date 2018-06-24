//Compute the area of the base and the volume
import java.util.Scanner;
public class HW02P02 {
	public static void main(String[] args) {
		double area;
		double volume;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length, width, and height of a pyramid:");
		double length = input.nextDouble();
		double width  = input.nextDouble();
		double height = input.nextDouble();
	    area = length * width;
		volume = (1.0/3) * area * height;
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
		
	}
		


}