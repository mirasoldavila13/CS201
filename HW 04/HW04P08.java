import java.util.Scanner;


public class HW04P08{
	public static void main(String[] args) {
		int usersInput;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		usersInput = input.nextInt();
		
		int totalRows = usersInput; //use users input as the total rows since its the length of one side.
		int row, columnSpace, columnDollar; // row prints the rows, columnSpace is prints the space, ColumnDollar is printing the dollar sign
		
		for(row = 1; row <= totalRows; row++) {
			for(columnSpace = totalRows - row; columnSpace >= 1; columnSpace--) {
				System.out.print(" ");
			}// printing spaces
			for(columnDollar = 1; columnDollar <= 2 * row - 1; columnDollar++){
				System.out.print("$");
			}
			System.out.println(" ");
		}// printing dollar signs
		
		
		for(row = totalRows - 1; row >= 1; row--){
			for(columnSpace = 1; columnSpace <= totalRows - row; columnSpace++){
				System.out.print(" ");
			}
			
			for(columnDollar = 1; columnDollar <= 2 * row - 1; columnDollar++) {
				System.out.print("$");
			}
			System.out.println(" ");
		}
		
	}
}