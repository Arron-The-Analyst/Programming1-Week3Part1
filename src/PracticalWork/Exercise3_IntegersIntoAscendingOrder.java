package PracticalWork;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Exercise3_IntegersIntoAscendingOrder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to our sorting numbers program.");
		System.out.println(" ");
	
	do{	System.out.println("Please enter your first integer to be sorted.");
		int a = input.nextInt();
		System.out.println("Please enter your second integer to be sorted.");
		int b = input.nextInt();
		System.out.println("Please enter your third integer to be sorted.");
		int c = input.nextInt();
		
		ArrayList numbers = new ArrayList();
		numbers.add(a);
		numbers.add(b);
		numbers.add(c);
		Collections.sort(numbers);;
		System.out.println("Your sorted list is" + " "+ numbers);
		System.out.println(" ");
	}while(true);
	}

}
