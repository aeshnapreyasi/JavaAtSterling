/* Write a program to print the following pattern:

5 5 5 5 5
5 5 5 5 5
5 5 5 5 5
5 5 5 5 5
5 5 5 5 5 */

public class printPatternSquare{
	public static void main(String[] args){

		int i = 1;
       		 while (i <= 5) {
			int j = 1;
            		while (j <= 5) {
                		System.out.print("5 ");
			j++;
		}
            	System.out.println(); 
            	i++;
        	}
 	   }
}