import java.util.Scanner;



public class HW04P06 {
	public static void main(String[] args) {
		
		int usersinput;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number for n: ");
		
		usersinput = input.nextInt();
		
		int temp1 = 0;
		int temp2 = 1;
		int counter = 1;
		int count = 0;
		
		
		while(counter <= usersinput) {// suppose to hard code the first number 1? 

			else if(counter == 2) {
				System.out.print("1 ");
			}
			if(count % 10 == 0){
				System.out.println();
			}
			else {
				int answer = temp1 + temp2;
				temp1 = temp2;//switch values of temp1 and temp2
				temp2 = answer;
				System.out.printf("%d ", answer);
			}
			counter++;
			count++;
		}
		
		
		
	}	
}