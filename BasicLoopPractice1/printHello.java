 /* Write a program to print “Hello” and then print your name on a separate
line five times.
Expected Output:
Hello
Sterling Institute
Hello
Sterling Institute
Hello
Sterling Institute
Hello
Sterling Institute
Hello
Sterling Institute */

public class printHello{
	public static void main(String[] args){

		int i = 1;
		while(i <= 5){
			System.out.println("Hello");
			System.out.println("Sterling Institute");
			i++;
		}
	}
}