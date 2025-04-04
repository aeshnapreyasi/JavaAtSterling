//Write a program to check whether a character is uppercase or lowercase alphabet

public class IsUppercaseOrLowercase {
	public static void main(String[] args) {
	
		char character = 'a';

		if(character >= 'A'){
			if(character <= 'Z'){
				System.out.println(character + " is a uppercase alphabet");
			} 	
		} else if(character >= 'a'){
			if(character <= 'z'){
				System.out.println(character + " is a lowercase alphabet");
			}
		} else {
			System.out.println(character + " is not an alphabet");
		}
	}
}