package PracticalWork;
import java.util.Scanner;
public class Exercise1_NumberChecker {

	public static void main(String[] args) {
		
	do{	Scanner input = new Scanner(System.in); 
		System.out.println("Please enter a number you wish to check to see if it is an odd or even number");
		int number = input.nextInt();
		 
		if(number%2 == 0) {
			System.out.print("True");
			System.out.println(" ");
			System.out.println(" ");}
		
		else {System.out.print("False");
		System.out.println(" ");
		System.out.println(" ");} 
	}while(true);
	}}
	


