// Write a program to find maximum between three numbers 

public class MaximumBetweenThreeNumbers{
	public static void main(String [] args){

		int a = 1000;
		int b = 1000;
		int c = 1000;

		if(a > b && a > c){
			System.out.println(a + " is greater than " + b +" and "+ c);
		}

		else if(b > a && b > c ){
			System.out.println(b + " is greater then " + a + " and " +c);
		}

		else if (c > a && c > b){
			System.out.println(c + " is greater than " + a + " and " +b);
		}
		else {
			System.out.println("All three numbers are equal");
		}
	}
}