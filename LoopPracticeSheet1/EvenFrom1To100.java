// Write a program to print even numbers from 1 to 100

public class EvenFrom1To100{
	public static void main(String[] args){

		for(int i = 0; i <= 100; i++){
			if(i % 2 == 0){
				System.out.print(i + " ");
			}
		}
	}
}