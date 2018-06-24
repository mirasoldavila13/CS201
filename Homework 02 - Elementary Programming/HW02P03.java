import java.util.Scanner;
public class HW02P03 {
	public static void main(String[] args) {
		int aTicketsCost = 15;
		int bTicketsCost = 12;
		int cTicketsCost = 9;
		double aTotalAmount;
		double bTotalAmount;
		double cTotalAmount;
		double totalSales;
		
		Scanner in = new Scanner(System.in);
		System.out.print("How many Class A tickets were sold?:");
		double aTicketsSold = in.nextDouble();
		System.out.print("How many Class B tickets were sold?:");		
		double bTicketsSold = in.nextDouble();
		System.out.print("How many Class C tickets were sold?:");
		double cTicketsSold = in.nextDouble();
		aTotalAmount = aTicketsSold * aTicketsCost;
		bTotalAmount = bTicketsSold * bTicketsCost;
		cTotalAmount = cTicketsSold * cTicketsCost;
		System.out.println("Class A Total: $" + aTotalAmount);
		System.out.println("Class B Total: $" + bTotalAmount);
		System.out.println("Class C Total: $" + cTotalAmount);
		totalSales = aTotalAmount + bTotalAmount + cTotalAmount;
		System.out.println("                                   ");
		System.out.println("Total Sales: $" + totalSales);
		
		
	
		
	}

}