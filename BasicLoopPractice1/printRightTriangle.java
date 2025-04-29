/* Write a program to print the following pattern:

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5 */

public class printRightTriangle{
	public static void main(String[] args){

		int i = 1;
		while (i<=5){
			int j = 1;
			while(j <= i){
				System.out.print(j);
				j++;
			}
		System.out.println();
		i++;
		}
	}
}