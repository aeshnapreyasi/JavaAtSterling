/* Write a program to check whether a character is alphabet, digits or special character */

public class CharacterCheck{
	public static void main(String[] args){
		
		char character = 'G';
		
		if(character <= 'A'){
			if(character >= 'Z'){
				System.out.println(character + " is a alphabet");
			}
		} else if(character <= 'a'){
			if(character >= 'z'){
				System.out.println(character + " is a alphabet");
			}
		} else if ( character <= 0) {
			if(character >= 9){
				System.out.println(character + " is a digit");
			}
		} else{
			System.out.println(character + " is a special character");
		}
	}
} 