package homework;
import java.util.Scanner;
public class HW05P01 {
	public static void main(String[] args) {
		 userInput();//call the method
	
	}
	
	//create a method for the users input
	public static void userInput(){
		//Initialize the variable n
		int n;
		//Create a Scanner
		Scanner input = new Scanner(System.in);
				
		//ask the user for the value of x
		System.out.print("Enter a value for x: ");
				
		//receive users input
		 n = input.nextInt();
		result(n);
	}
	
	
	//create another method for the formula
	public static void formula(int n){
		int num =  (n * (7 * n - 3)) / 5; 
		 System.out.print(num + " ");
	}
	
	
	//create another method that has an integer parameter
	public static void result(int n){//use void for it won't return a value
		final int NUMBER_PER_LINE = 7;
		int count = 0;
		for (int i = 1 ; i <= n; i++){
			formula(i);
			count ++;
			if(count % NUMBER_PER_LINE == 0){//7 results per line
				System.out.println();
			}
		}
	}
	


	
}
