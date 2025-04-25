/* Write a program to print the print patter
5 5 5 5 5
5 5 5 5 5
5 5 5 5 5
5 5 5 5 5
5 5 5 5 5 */

public class PrintRectanlgePattern{
	public static void main(String[] args){

		for(int i = 1; i<=5; i++){
			for(int j = 1; j<=5; j++){
				System.out.print("5");
			}
			System.out.println();
		}
	}
}