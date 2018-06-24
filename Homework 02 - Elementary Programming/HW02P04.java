import java.util.Scanner;
public class HW02P04 {
	public static void main(String[] args) {
		double windChillTemperature;
	
	
		Scanner in = new Scanner(System.in);
	
		System.out.print("Enter a temperature in Fahrenheit between -58F and 41F: ");
		double outsideTemperature = in.nextDouble();
	
		System.out.print("Enter a wind speed greater than or equal to 2 in miles per hour: ");
		double windSpeed = in.nextDouble();
		
		double myPower = Math.pow(windSpeed, 0.16);
	
		windChillTemperature = (35.74 + (0.6215 * (outsideTemperature)) - (35.75 * (myPower)) +  
		((0.4275 * (outsideTemperature)) * (myPower)));
	
		System.out.println("The wind chill temperature is " + windChillTemperature);
	 
	
	 
	}
}