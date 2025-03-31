//Write a program to check whether a number is negative, positive or zero


public class NumberIsPostiveOrNegative{
	public static void main(String[] args){

		int num = 0;
		
		if( num > 0){
			System.out.println(num + " is positive number");
		} 
	
		else if(num < 0){
			System.out.println(num + " is negative number");
		}
	
		else{
			System.out.println(num + " is zero");
		}
	}
}