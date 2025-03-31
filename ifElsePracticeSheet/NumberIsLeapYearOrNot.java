//Write a program to check whether a year is a leap year or not

public class NumberIsLeapYearOrNot{
	public static void main(String[] args){

		int year = 2028;

		if(year % 4 == 0){
			System.out.println(year + " is a leap year");
		}
		else{
			System.out.println(year + " is not a leap year");
		}
	}
}