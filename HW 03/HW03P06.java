import java.util.Random;
public class HW03P06 {
	public static void main(String[] args) {
		int rank = (int)(Math.random() * 13) + 1;
		int suit = (int)(Math.random() * 4) + 1;
	
	
		System.out.print("The card you picked is ");
		
		if (rank == 1) {
			System.out.print("Ace");
		}
		else if (rank == 11) {
			System.out.print("Jack");
		}
		else if (rank == 12) {
			System.out.print("Queen");
		}
		else if (rank == 13) {
			System.out.print("King");
		}
		else {
			System.out.print(rank);
		}
		
		System.out.print(" of ");
				
		
		if (suit == 1){
			System.out.print("Clubs");
		}
		else if (suit == 2) {
			System.out.print("Diamonds");
		}
		else if (suit == 3) {
			System.out.print("Hearts");
		}
		else {
			System.out.print("Spades");
		}
		
	}
}