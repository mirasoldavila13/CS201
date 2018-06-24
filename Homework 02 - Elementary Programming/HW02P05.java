import java.util.Scanner;
public class HW02P05 {
	public static void main(String[] args) {
		double billSubtotal;
		double stateTax;
		double percentageOfTip;
		double total;
		double individualAmount;
		
		Scanner in = new Scanner(System.in);
		  //Ask the user to enter the subtotal of the bill.
		System.out.print("What is the subtotal of the bill?: ");
		double subtotal = in.nextDouble();
		
	      //Ask the user how much tax the state currently charges (this value should be entered as a decimal value).
		System.out.print("How much tax does your state currently charge?: ");
		double tax = in.nextDouble();
		
	      //Ask the user for the percentage of tip you would like to leave (again as a decimal value).
		System.out.print("What percentage of tip would you like to leave?: ");
		double tip = in.nextDouble();
		
		  //Ask the user for how many people are dining in your party.
		System.out.print("How many people are in your party?: ");
		double personOwes = in.nextDouble();
		
		  //calculate the following: compute the tax amount, percentage, total, and how much each person owes
		billSubtotal = subtotal;
		stateTax = subtotal * tax;
		percentageOfTip = (subtotal + stateTax) * tip;
		total = billSubtotal + stateTax + percentageOfTip;
		individualAmount = total / personOwes;
		
		
		  //Display an itemized printout of the calculated information 
		System.out.println("Subtotal:           $" + billSubtotal);
		System.out.println("Tax:                $" + stateTax);
		System.out.println("Tip:                $" + percentageOfTip);
		System.out.println("Total:              $" + total);
		System.out.println("Each Person Owes:   $" + individualAmount);
	
	}


}