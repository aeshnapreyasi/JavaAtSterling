//Write a program to check whether a number is divisible by 5 and 11 or not

public class NumberIsDivisibleBy5Or11{
	public static void main(String[] args){

		int num = 67;
		
		if(num % 5 == 0 && num % 11 == 0){
			System.out.println(num + " is divisible by 5 and 11");
		}

		else{
			System.out.println(num + " is not divisible by 5 and 11");
		}
	
	}
}