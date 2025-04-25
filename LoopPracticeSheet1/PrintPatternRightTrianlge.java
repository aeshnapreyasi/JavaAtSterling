/* Write a program to print the following pattern:
Expected Output:
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5 */


public class PrintPatternRightTrianlge{
	public static void main(String[] args){
	
		for(int i = 1; i<=5; i++){
			for(int j = i; j<=5; j++){
				System.out.print(1);
			}
			System.out.println();
		}
	}
}