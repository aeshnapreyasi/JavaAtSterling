// Write a program to swap to numbers without using third variable 

public class swapTwoNumbersWithoutThirdVariable{
	public static void main(String[] args){

	int a = 2;
	int b = 3;
	
	System.out.println("Before Swapping: " + a +" "+ b);

	a = a+b;
	b = a-b;
	a = a-b;

	System.out.println("After Swapping: " + a + " " + b);

	}
}