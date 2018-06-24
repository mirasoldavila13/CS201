/*Write a program which includes the following requirements:  

 Write a method that takes the size of an array as a parameter and then creates and populates an array of
integers with user entered data. The method should return the created array.
Write a method that takes the size of an array as a parameter and then randomly generates an array of the
given size with characters from ['a', 'z'].
 Write properly overloaded methods which take an array as a parameter and prints the array. The output
should be formatted so that each element of the array appears on one line separated by one space.
 Write properly overloaded methods which take an array as a parameter and prints the first, middle, and
last elements of the given array.
 Write a method that takes an array of integers and returns the sum of the array*/


package homework;
import java.util.Random;
import java.util.Scanner;

public class HW06P01 {

	public static void main(String[] args) {
		int[] arrayData = populateArray(10);//accepts the size of the parameter
		char[] characterData = characterArray(10);
		System.out.println("The integers are: ");
		printArray(arrayData);
		System.out.println("The characters are: ");
		printArray(characterData);
		
	}
	
	public static int[] populateArray(int size){
		//Create a scanner
		Scanner input = new Scanner(System.in);
		
		//Create an array 
		int[] array = new int[size];//use the parameter  as the size of the array
		
		for(int i = 0; i < array.length; i++){
			System.out.print("Enter a value for integer # " + (i + 1) + ": ");
			int iarray = input.nextInt();//receive users input
			array[i] = iarray;//store their input within the array and then return the array
		}
		return array;//return the array
		
	}
	//create an method that randomly generates an array with given size w/ characters ['a' - 'z']
	public static char[] characterArray(int array){
		char[] chars = new char[array];//pass the parameter into the char array
		Random ran = new Random(); // Create a Random Scanner
		for(int i = 0; i < array; i++){
			chars[i] = (char)(ran.nextInt(26) + 97); // 97 is 'a'
			
		}
		return chars ;
	}


	
	//display the array of integers.. call the method
	public static void printArray(int[] array) {
		for(int x : array){
			System.out.println(x);
		}
	}
	
	public static void printArray(char[] chars){
		for(char x : chars){
			System.out.println(x);
		}
	}
	

}
