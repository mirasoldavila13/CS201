import java.util.Scanner;


public class HW04P02 {
	public static void main(String[] args) {
		int n = 0; 
		double sumOfValue = 0; 
		double sumOfDeviation = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter values: ");
		double values = input.nextDouble(); 
		
		while (values >= 0) { 
			sumOfValue += values;
			sumOfDeviation += Math.pow(values, 2);
			n += 1;
			values = input.nextDouble();
		}
		if (n > 0) {
			double mean = sumOfValue / n;
			System.out.println("Mean: " + mean);
			
			double deviation = Math.sqrt( ( sumOfDeviation - ( sumOfValue * sumOfValue ) / n ) / ( n - 1 ) );
			System.out.println("Deviation: " + deviation);
		} 
		else {
			System.out.println("This set of values cannot calculate the mean or the deviation."); 
		}

	}
}