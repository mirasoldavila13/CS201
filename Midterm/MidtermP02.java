import java.util.Scanner;
public class MidtermP02 {
	public static void main(String[] args) {
		
		System.out.println("Substance     \t Freezing Point \t Boiling Point");
		System.out.println("Ethyl Alcohol \t -173           \t 172");
		System.out.println("Mercury       \t  -38           \t 676");
		System.out.println("Oxygen        \t -361           \t -306");
		System.out.println("Water       \t   32             \t 212");
	
		Scanner input = new Scanner(System.in);
	
		System.out.print("\n Enter a temperature:");
		int temperature = input.nextInt();
		
		if(temperature < 0) {
			System.out.println("Ethyl Alcohol will freeze at " + temperature + " degrees");
			System.out.println("Mercury will freeze at " + temperature + " degrees");
			System.out.println("Water will freeze at " + temperature + " degrees");
			System.out.println("Oxygen will boil at " + temperature + " degrees"); 
		}
		else if(temperature < 172) {
			System.out.println("Water will freeze at " + temperature + " degrees");
			System.out.println("Oxygen will boil at " + temperature + " degrees");
			
		}
		else if(temperature >= 172) {
			System.out.println("\n Ethyl Alcohol will boil at " + temperature + " degrees ");
			System.out.println("Mercury will boil at " + temperature + " degrees");
		}
		else if(temperature == 212) {
			System.out.println("Water will boil at " + temperature + " degrees");
		}
		
		else {
			System.out.println("Program will now end!");
			System.exit(1);
		}
	}
}