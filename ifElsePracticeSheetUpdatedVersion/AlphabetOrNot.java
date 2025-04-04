// Write a program to check whether a character is alphabet or not

public class AlphabetOrNot {
	public static void main(String[] args){

		char character = '9';
		if(character >= 'a'){
			if(character <= 'z'){
				System.out.println(character + " is an alphabet");
			}
		} else if(character >= 'A') {
				if(character <= 'Z'){
					System.out.println(character + " is an alphabet");
			}
		}
		else{
			System.out.println("Enter the proper alphabet");
		}
	}	
}