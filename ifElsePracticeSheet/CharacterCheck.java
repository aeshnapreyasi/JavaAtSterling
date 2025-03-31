/* Write a program to check whether a character is alphabet, digits or special characters */

public class CharacterCheck{
	public static void main(String[] args){

		char character = 'G';
		
		if((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')){
			System.out.println(character + " is alphabet");
		}

		else if(character >= '0' && character <= '9'){
			System.out.println(character + " is digit");
		}	
	
		else{
			System.out.println(character + " is special characters");
		}
	}
}