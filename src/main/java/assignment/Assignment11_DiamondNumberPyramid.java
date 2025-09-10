package assignment;

public class Assignment11_DiamondNumberPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int n = 5; // Number of rows in the top half of the diamond

	        // Upper half of the diamond
	        for (int i = 1; i <= n; i++) {
	            // Print spaces
	            for (int j = n; j > i; j--) {
	                System.out.print(" ");
	            }
	            // Print numbers
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        }

	        // Lower half of the diamond
	        for (int i = n - 1; i >= 1; i--) {
	            // Print spaces
	            for (int j = n; j > i; j--) {
	                System.out.print(" ");
	            }
	            // Print numbers
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        }
	    }
	}

	
