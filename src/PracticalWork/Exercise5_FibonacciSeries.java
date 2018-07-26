package PracticalWork;
import java.util.Scanner;
public class Exercise5_FibonacciSeries {
	
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = 0;
		int count =0;
		
	do{ 
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a number you wish to find the fibonacci series for");
		int number = input.nextInt();
		
		if(number == 0) {System.out.println("The fibancci number for 0 is 0");}
		if(number == 1) {System.out.println("The fibancci number for 1 is 1");}
		
		for(int i =2; i <= number; i++) {
		c = b + a ;
		a=b;
		b=c;		
		count =1;}
			
	    if(count == 1){System.out.println("Your number" + " " + number + " fibonacci's number is" +" " + c);
		System.out.println(" ");}	
		
		}while(true);	
	}
}
