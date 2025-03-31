//Write a program to check whether an alphabet is vowel or consonant

public class IsAlphabetOrVowel{
	public static void main(String[] args){

		char alphabet = 'z';

		if(alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u'){
			System.out.println(alphabet + " is vowel");
		}
		
		else{
			System.out.println(alphabet + " is consonant");
		}
	}

}