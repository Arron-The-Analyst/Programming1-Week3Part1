package PracticalWork;
import java.util.Scanner;
public class Exercise2_PrimeChecker {

	public static void main(String[] args) {
	do{	int checker = 0;
	    Scanner input = new Scanner(System.in);
	    System.out.println("Please enter a number you wish to check is a prime number");
	    int number = input.nextInt();
	   
	    if (number < 2) {System.out.println("Your number" + " " + number + " is not a prime number.");
        checker =1;}
	    
	    else {
	    for (int i=2; i<=number/2; i++) {
	    if(number%i == 0) {
	    	System.out.println("Your number" + " " + number + " is not a prime number.");
	    	 checker = 1;
	    	 break;}
	    	}
        }
	    
	    if(checker ==0) {System.out.println("Your number" + " " + number + " is a prime number!!");}
	    System.out.println(" ");
	} while(true);     
  
	}
} 
	    
	


