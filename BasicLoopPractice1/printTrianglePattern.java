/* Write a program to print the following pattern:

1
2 2
3 3 3
4 4 4 4
5 5 5 5 5 */

public class printTrianglePattern{
	public static void main(String[] args){

		int i = 1;
		while (i <= 5){
			int j = 1;
			while (j <= i){
				System.out.print(i);
				j++;
			}
		System.out.println();
		i++;
		}
	
	}
}