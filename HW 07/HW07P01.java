package homework;
import java.util.Random;
import java.util.Scanner;
public class HW07P01 {
	
	public static void main(String[] args){
		// Create a scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numbers of rows and the number of columns: ");
		int rows = input.nextInt();// number of rows
		int col = input.nextInt(); // number of columns

		int[][] table;// array of an array
		table = randomInteger(rows, col);// 2d array take the users input as the rows and col


		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		int[][] randomInteger = table;
		System.out.println("The entire sum of the array is: " + sumOfArray(randomInteger));
		averageOfArray(randomInteger);
		row(randomInteger);
		columm(randomInteger);
		majorDiagonal(randomInteger);
		minorDiagonal(randomInteger);


	}


	public static int randomint(){
		Random rand = new Random();
		int randomNum = rand.nextInt(10);
		return randomNum;
	}

	public static int[][] randomInteger(int r, int c){
		int[][] integerTable = new int[r][c];// array of an array
		for(int i = 0; i < integerTable.length; i++){
			for(int j = 0 ; j < integerTable[i].length; j++){
				integerTable[i][j] = randomint();	// called the random method [0 - 10) 		
			}
		}
		return integerTable;
	}

	// create a method that has the total sum and average of the entire array
	public static int sumOfArray(int[][] array){
		int sum = 0;
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				sum +=  array[i][j];

			}

		}
		return sum;
	}

	//create a method that has the total average of the entire array
	public static void averageOfArray(int[][] array){
		double average = 0.0;
		average = (double)sumOfArray(array)/ array.length;
		System.out.println("The average of the entire array is: " + average);
		System.out.println();
	}

	//Create a method that takes the sum and average  of each row
	public static void row(int[][] array){//need to fix this by find the average of each row
		double average = 0.0;
		for(int i = 0; i < array.length; i++){
			int rowTotal = 0;
			for(int j = 0; j < array[0].length; j++){
				rowTotal += array[i][j];				
			}	
			average = (double)rowTotal / array.length;
			System.out.println("The sum of row " + (i + 1) + " is: " + rowTotal);
			System.out.println("The average of row " + (i + 1) + " is " + average);
			System.out.println();
		}
		System.out.println();
	}

	//create a method that takes the sum and average of each columns
	public static void columm(int[][] array){//this by finding the average of each column

		double average = 0.0; 

		for(int j =0 ; j < array[0].length; j++){
			int colTotal = 0;
			for(int i = 0; i < array.length; i++){
				colTotal += array[i][j];

			}
			average = (double)colTotal / array.length;
			System.out.println("The sum of column " + (j + 1) + " is: " + colTotal);
			System.out.println("The average of column " + (j + 1) + " is: " + average);
			System.out.println();
		}
		System.out.println();
	}
	//create a method that takes the sum and average of a major diagonal that runs from the upper left
	public static void majorDiagonal(int[][] array){
		int sum = 0; 
		double average = 0.0;
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				if(i == j){
					sum += array[i][j];
				}
			}
		}
		average = (double)sum / array.length;
		System.out.println("The sum for the Major Diagonal is: " + sum);
		System.out.println("The average for the Major Diagonal is: " + average);
		System.out.println();
	}
	//create a method that takes the sum && average of a minor diagonal
	public static void minorDiagonal(int[][] array){
		int sum = 0;
		double average = 0.0;
		for(int i = 0; i < array.length; i++){
			for(int j= 0; j < array[i].length; j++){
				if(i + j == array[i].length - 1){
					sum += array[i][j];
				}
			}
		}
		average = (double)sum / array.length;
		System.out.println("The sum for the Minor Diagonal is: " + sum);
		System.out.println("The average of the Minor Diagonal is: " + average);

	}
}	

