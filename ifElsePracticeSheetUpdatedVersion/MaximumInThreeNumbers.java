// Write  a program to find the maximum between three numbers

public class MaximumInThreeNumbers{
	public static void main(String[] args){

		int num1 = 94;
		int num2 = 94;
		int num3 = 94;
	
		if(num1 > num2){
			if(num1 > num3){
				System.out.println(num1 + " is maximum from" + num2 +" and "+ num3);
			}
			else if(num1 == num3){
				System.out.println(num1 + num3 + "both is greater than " + num2);
			}
			else{
				System.out.println(num3 + " is greatest of among all");
			}


		}
	
		else if(num1 == num2) {
			if(num1 > num3){
				System.out.println(num1 +" and " + num2+" both is greater than " + num3);
			}
			else if(num1 == num3){
				System.out.println("All three numbers are equal");
			}
			else{
				System.out.println(num3 + " is greatest of among all");
			}
		}

		else if(num1 < num2){
			if(num2 > num3){
				System.out.println(num2 + " is greates of among all");
			}
			else if(num2 == num3){
				System.out.println(num2 +" and "+ num3 + " is equal");
			}
			else{
				System.out.println(num3 + " is greater than num1 and num2");
			}
		}

		else{	
			System.out.println("Enter the three integer number only");
		}
	}
}