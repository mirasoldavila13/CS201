import java.util.Scanner;
public class HW02P06 {
	public static void main(String[] args) {
		double adultGrossRevenue;
		double adultNetRevenue;
		double childGrossRevenue;
		double childNetRevenue;
		double totalGrossRevenue;
		double totalNetRevenue;

		Scanner input = new Scanner(System.in);
   
        // Ask the user how many adult tickets were sold.
		System.out.print("Enter Adult Tickets Sold: ");
		double adultTicketsSold = input.nextDouble();
	 
	    // Ask the user how many child tickets were sold.
		System.out.print("Enter Child Tickets Sold: ");
		double childTicketsSold = input.nextDouble();
		System.out.println("                        ");
	 
	    // Ask the user for the price per adult ticket.
		System.out.print("Enter Price Per Adult Ticket: ");
		double pricePerAdult = input.nextDouble();
	 
	    // Ask the user for the price per child ticket.
		System.out.print("Enter Price Per Child Ticket: ");
		double pricePerChild = input.nextDouble();
		System.out.println("                   ");
	 
	    // Ask the user what percentage is paid to the move company.
		System.out.print("Enter Movie Company Percentage: ");
		double paidMoviePercentage = input.nextDouble();
		System.out.println("                      ");
	 
	 
	    // Gross revenue for adult tickets sold. 
		adultGrossRevenue = adultTicketsSold * pricePerAdult;
		
	    // Net revenue for adult tickets sold.
		adultNetRevenue = (adultGrossRevenue - (adultGrossRevenue * paidMoviePercentage));
	  

	  
	    // Gross revenue for child tickets sold. 
		childGrossRevenue = childTicketsSold * pricePerChild;
    
	    // Net revenue for child tickets sold. 
		childNetRevenue = (childGrossRevenue - (childGrossRevenue * paidMoviePercentage));

	    // Total gross revenue. 
		totalGrossRevenue = adultGrossRevenue + childGrossRevenue;
	
	    // Total net revenue. 
		totalNetRevenue = adultNetRevenue + childNetRevenue;
	
	    
		System.out.println("Sales Report:");
		System.out.println("------------------------------------------------");
		System.out.println("Gross Revenue (Adult): $" + adultGrossRevenue);
		System.out.println("Net Revenue  (Adult): $" + adultNetRevenue);
		System.out.println("                         ");
		System.out.println("Gross Revenue (Child): $" + childGrossRevenue);
		System.out.println("Net Revenue  (Child): $" + childNetRevenue);
		System.out.println("                          ");
		System.out.println("Total Gross Revenue: $" + totalGrossRevenue);
		System.out.println("Total Net Revenue: $" + totalNetRevenue);
	
	}



}