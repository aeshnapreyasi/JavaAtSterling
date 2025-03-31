// Write a program to check whether a character is uppercase or lowecase alphabet 

public class UpperCaseOrLowerCase{
	public static void main(String[] args){
		
		char character = 't';
		
		if (character >= 'a' && character <= 'z'){
			System.out.println(character +" is lowercase alphabet");
		}
	
		else {
			System.out.println(character + " is uppercase alphabet");
		}
	}
}