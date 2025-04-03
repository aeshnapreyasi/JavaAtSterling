//Write a program to find maximum between two numbers

public class MaximumBetweenTwo {
	public static void main(String[] args) {

		int num1 = 90;
		int num2 = 90;

		if(num1 > num2){
			System.out.println(num1 + "is greater than num2");
		}
	
		else if(num1 < num2){
			System.out.println(num2 + "is greater than num1");
		}
		else{
			System.out.println("Both number is equal");
		}
	}
}