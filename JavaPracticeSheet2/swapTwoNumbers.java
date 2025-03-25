// Write a program to swap two numbers by using third variable 

public class swapTwoNumbers{
	public static void main(String [] args){

	int a = 2;
	int b = 4;

	System.out.println("Before swap: "+ a +" " + b);
	
	int temp = a;
	 a = b; 	
	 b = temp;
	
	System.out.println("After Swap:" + a +" " + b);
	
	

	}
}