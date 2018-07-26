package PracticalWork;
import java.util.Scanner;
public class Exercise4_FactorialProgram {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	do{ System. out.println("Please enter a number you wish to calculate the factorial for");
	int count =0;
	int output=1;
	int number = input.nextInt();
	
	if(number == 0) { System.out.println("The factorial of this number is 1");}
		
	else {
		for(int i = 1; i<=number; i++) {
		    output = (output * i);}
		    count =1;
	
	if (count == 1) {System.out.println("The factorial of this number is" + " "+ output);
	System.out.println(" ");}
	
	}} while(true);	
		}	
	}


