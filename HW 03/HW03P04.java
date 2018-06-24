import java.util.Scanner;
public class HW03P04 {
	public static void main(String[] args) {
	//declare variable type
	double maximumOfHours;
	double regularPay = 0;
	double overTimePay = 0;
	double totalPay;
	
	//create a Scanner
	Scanner input = new Scanner(System.in);
	
	//ask the user to enter their hourly wage
	System.out.print("What is your hourly wage: ");
	double hourlyWage = input.nextDouble();
	
    //ask the user to enter the amount of hours they worked this week
	System.out.print("How many hours did you work this week? ");
	double hoursWorked = input.nextDouble();
	
	//User cannot enter a negative value
	if (hourlyWage < 0 || hoursWorked < 0) {
		System.out.println("Incorrect input");
		System.exit(1);
	}
	if (hoursWorked > 40) {
		maximumOfHours = 40;
		regularPay = hourlyWage * maximumOfHours;
		overTimePay = (hourlyWage * 1.5) * (hoursWorked - maximumOfHours);
	//if the user worked more than 40 hours within the week they will get paid over time
	}
	else {
		regularPay = hourlyWage * hoursWorked;
	//if the user worked 40 hours or less within the week the will get paid regularly
	}
	
	
	totalPay = regularPay + overTimePay;
	
	System.out.println("Regular Pay:     "  +  regularPay);
	System.out.println("Overtime Pay:    "  +  overTimePay);
	System.out.println("Total Pay:       "  +  totalPay);


	}
}