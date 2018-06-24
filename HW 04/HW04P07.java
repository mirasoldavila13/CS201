import java.util.Scanner;

public class HW04P07 {
	public static void main(String[] args) {
		int usersInput;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		usersInput = input.nextInt();
	
		int row = 0, column1 = 0,  column2, totalRows = usersInput, columnSpace, numOfColumn;
		for(row = 1; row <= totalRows; row++){
			for(column1 = 1; column1 <= row; column1++){
				System.out.print(column1);
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(row = totalRows; row >= 1; row--){//pattern b
			for(column1 = 2; column1 <= 2 * row; column1++){
				if(column1 % 2 == 0) {
					System.out.print(column1);
				}
				else {
					System.out.print(" ");
				}	
			}
			 System.out.println(" ");
		}
		System.out.println();
		
		
		numOfColumn = totalRows - 1;
		
		for(row = 1; row <= totalRows; row++) {//pattern c third inner loop find a way to use string
			for(column1 = 1; column1 <= numOfColumn; column1++){
				System.out.print(" ");
			}
			numOfColumn--;
			
			for(column2 = 1; column2 <= row; column2++) {
				System.out.print( column2);
				
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(row = 1; row <= totalRows; row++) {//third inner loop find a way to use string
			for(columnSpace = totalRows - row; columnSpace >= 1; columnSpace--) {
				System.out.print(" ");
			}
			for(column1 = 1; column1 <= 2 * row - 1; column1++){
				System.out.print(" ");
			}
			for(columnSpace = totalRows - row; columnSpace >= 1; columnSpace--) {
				System.out.print(columnSpace);
			
			}
			System.out.println();
		}
		
	
	}
}