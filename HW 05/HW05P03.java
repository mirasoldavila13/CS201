package homework;
import java.util.Scanner;
public class HW05P03 {

	// 1. Create a method that prompts the user for a password
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String password;
		
		System.out.print("Enter a password: ");
		 password = input.nextLine();
		 
		System.out.println(characters(password));
	}
	
	// 2. Create a method where the password requires 11 characters
	public static String characters(String password){
		if(password.length() < 11){
			return "Password must have 11 characters.";
		}
		else{
			return digits(password);
		}	
	}
	
	// 3. Create a method where the password needs to have at least 2 digits
	public static String digits(String password){
		int digitCounter = 0;
		for(int i = 0; i < password.length(); i++){
			char ch = password.charAt(i);
			if(Character.isDigit(ch)){
				digitCounter++;
			}
		}
		
		if(digitCounter < 2){
			return "Password must have the minimum of 2 digits";
		}
		else{
			return letterRequirement(password);
		}
	}
	// 4. Create a method where the password must have 5 letters
	public static String letterRequirement(String password){
		int letterCounter = 0;
		for(int i = 0; i < password.length(); i++){
			char ch = password.charAt(i);
			if(Character.isLetter(ch)){
				letterCounter++;
			}
		}
		
		if(letterCounter < 5){
			return "Password must be 5 letters";
		}
		else {
			return upperCaseRequirement(password);
		}
	}
	// 5. Create a method where the password has to have at least 2 upper case letters
	public static String upperCaseRequirement(String password){
		int upperCaseCount = 0;
		for(int i = 0; i < password.length(); i++){
			char ch = password.charAt(i);
			if(Character.isUpperCase(ch)){
				upperCaseCount++;
			}
		}
		
		if(upperCaseCount < 2){
			return "Password must contatin at least 2 upper case letter";
		}
		else {
			return specialCharacters(password);
		}
	}
	
	// 6. Create a method where the password has 3 non-alphanumeric characters
	public static String specialCharacters(String password){
		int spaceCount = 0, specialCount = 0;
		for(int i = 0; i < password.length(); i++){
			char ch = password.charAt(i);
			if(Character.isWhitespace(ch)){
				spaceCount++;
			}
			else{
				specialCount++;
			}
		}
		if(spaceCount > 0){
			return "Password cannot have a space";
		}
		else if(specialCount < 3){//assumming the user imputs special characters
			return "Password must have at least 3  non-alphanumeric characters";
		}
		else{
			return "Password is valid";
		}
	}
}
