// Write a program to check whether a year is leap or not

public class YearLeapOrNot{
	public static void main(String[] args){
	
		int year = 1900;
	
		if(year % 4 == 0){
			if(year % 100 == 0){
				if(year % 400 == 0){
					System.out.println(year +" is a leap year");
				}
				else{
					System.out.println(year + " is not a leap year");
				}
			}
			else{
				System.out.println(year + " is a leap year");
			}

		}
		else{
			System.out.println(year + " is not a leap year");
		}
	}
}