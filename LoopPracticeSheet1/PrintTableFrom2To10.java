// Write a program to print a table from 2 to 10

public class PrintTableFrom2To10{
	public static void main(String[] args){
		
		for(int i = 2; i <= 10 ; i++){
			System.out.println(i);
		
			for(int j = 2; j <= 10; j++){
				System.out.println(j + "*" + i + "=" + (j*i)); 
				}
				System.out.println();
		}
	}
}