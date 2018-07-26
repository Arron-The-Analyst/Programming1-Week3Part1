package PracticalWork;
import java.util.Scanner;
public class Exercise7_ForLoopStructure {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the star structure generator");
		
        do{
        System.out.println("Please enter the number of stars you would like in your structure");
		int number = input.nextInt();
		System.out.println(" ");
		
			for(int i=0; i<number; i++) {
				for(int j=0; j<number; j++) {
					if(i>j-1) {
						System.out.print("*");
					}
				}
				System.out.println(" ");
			} 
		
		System.out.println(" ");
		} while(true);
      }
}



