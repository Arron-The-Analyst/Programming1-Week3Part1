package PracticalWork;
import java.util.Scanner;
public class Exercise6_WeightOfAParcel {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our postal delivery service.");
	    System.out.println("Please enter the weight of your parcel in kilograms.");
        double weight = input.nextDouble();
        
        if (weight < 1) {System.out.println("The postal charge for this parcel is £1.50 per kilogram.");}
        else if(1 <= weight && weight < 2) {System.out.println("The postal charge for this parcel is £3.00 per kilogram.");}
        else if(2 <= weight && weight < 3){System.out.println("The postal charge for this parcel is £4.00 per kilogram.");}
        else {System.out.println("The postal charge for this parcel is £5.00 per kilogram.");}     
	}
}
