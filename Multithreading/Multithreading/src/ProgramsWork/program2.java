package ProgramsWork;

import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int number = scanner.nextInt();
		        scanner.close();
		        
		        if (isNarcissistic(number)) {
		            System.out.println(number + " is a Narcissistic number.");
		        } else {
		            System.out.println(number + " is not a Narcissistic number.");
		        }
		    }

		    public static boolean isNarcissistic(int number) {
		        int originalNumber = number;
		        int sum = 0;
		        int digits = Integer.toString(number).length();

		        while (number != 0) {
		            int digit = number % 10;
		            sum += Math.pow(digit, digits);
		            number /= 10;
		        }

		        return sum == originalNumber;
		    }
		}// TODO Auto-generated method stub

	

