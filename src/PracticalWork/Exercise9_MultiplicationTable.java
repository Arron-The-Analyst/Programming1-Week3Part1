package PracticalWork;
import java.util.Scanner;
public class Exercise9_MultiplicationTable {

	public static void main(String[] args) {
		System.out.println("Welcome to our multiplication table program.");
	do{	System.out.println("Enter a number you wish to find the multiplcation table for");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		System.out.println(" ");
		System.out.println("The" +" "+ number + " "+ "times table is as follows:");
		
		for(int i=1; i<=12; i ++) {
			System.out.println(number + " " + "*" + " "+i+ " " + "="+ " "+ number * i);
			}
		System.out.println(" ");
		}while(true);
	}	
}
