package PracticalWork;
import java.util.Scanner;
public class Exercise10_LeapYearChecker {

	public static void main(String[] args) {
		System.out.println("Welcome to our leap year checker");
	do{	System.out.println("Please enter the year that you wish to check is a leap year");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
	
		if(year%400 == 0 && year%100 == 0 && year%4 == 0){System.out.println("Your year" + " " + year + " " + "is a leap year");}
		else  if(year%4 == 0 && year%100 == 0){System.out.println("Your year" + " " + year + " " + "is not a leap year");}
		else  if(year%4 == 0) {System.out.println("Your year" + " " + year + " " + "is a leap year");}
	    else {System.out.println("Your year" + " " + year + " " + "is not a leap year");}
	    System.out.println(" ");
		}while(true);
	}
}
	   
	
	
	
	


