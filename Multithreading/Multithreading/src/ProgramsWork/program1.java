package ProgramsWork;

import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {
		
	
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int number = scanner.nextInt();
		        scanner.close();

		        int originalNumber = number;
		        int result = 0;
		        int digits = 0;

		        // Calculate the number of digits
		        while (originalNumber != 0) {
		            originalNumber /= 10;
		            digits++;
		        }

		        originalNumber = number;

		        // Calculate the sum of the nth power of each digit
		        while (originalNumber != 0) {
		            int remainder = originalNumber % 10;
		            result += Math.pow(remainder, digits);
		            originalNumber /= 10;
		        }

		        // Check if the number is an Armstrong number
		        if (result == number) {
		            System.out.println(number + " is an Armstrong number.");
		        } else {
		            System.out.println(number + " is not an Armstrong number.");
		        }
		    }
		
		// TODO Auto-generated method stub

	
	

}
