package PracticalWork;

public class Exercise8_ForLoopPyrimid {

	public static void main(String[] args) {
		System.out.println("Below is my example of the number pyrimid.");
	
		 for (int i=0; i<5; i++){
			 for(int j=0; j<5-i; j++) {
				 System.out.print(" ");}
			 
			 for(int k=1; k<i+1; k++) {
			 System.out.print(k);}
			 
			 for(int l=i-1; l>0; l--) {
			 System.out.print(l);}
					 
		System.out.println(" ");
		 } } 
}

