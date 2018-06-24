public class HW04P01 {
	public static void main(String[] args) {
		
		char ch = '!', ch1 = '~'; //using the ASCII table 33 ~ 126 
		int count = 0;  // count will store the amount of times char is being printed. 
		for (char k = ch; k <= ch1; k++) { 
			System.out.print(k); 
			count++; 
			//once the boolean condition for count is true then it will print a new line. 
			if (count % 10 == 0) {
				System.out.println(); 
			} 
		} 
		
	}
}