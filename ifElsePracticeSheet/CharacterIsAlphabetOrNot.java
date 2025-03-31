//Write a program to check whether a character is alphabet or not

public class CharacterIsAlphabetOrNot{
	public static void main(String[] args){

		char alpha = '*';

	if ((alpha >= 'a' && alpha <= 'z') || (alpha >= 'A' && alpha <= 'Z')){
			System.out.println(alpha + " is an alphabet");
		} 
	
		else{
			System.out.println("Enter an alphabet properly");
		}
	}
}