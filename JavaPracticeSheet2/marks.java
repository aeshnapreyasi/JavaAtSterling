/* Write a program to enter marks of five sunject and calculate total, average and percentage. */

public class marks{
	public static void main(String[] arg){
	
	int Hindi = 89;
	int Maths = 88;
	int SocialStudies = 80;
	int Science = 79;
	int Sanskrit = 90;

	int total =Hindi + Maths+ SocialStudies+Science + Sanskrit;

	System.out.println("Total: " + total);

	System.out.println("Average:" + (total/2) );
	System.out.println("Percentage : "+ ((total*100)/500));
	
	}
}