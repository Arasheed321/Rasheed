import java.util.Scanner;

public class ReverseGivenNumber {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input: Get a number from the user
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        // Process: Calculate the reverse of the number
	        int reversedNumber = reverseNumber(number);

	        // Output: Print the reversed number
	        System.out.println("Reverse of the number is: " + reversedNumber);

	        scanner.close();
	    }

	    // Method to calculate the reverse of a number
	    private static int reverseNumber(int num) {
	        int reversed = 0;

	        while (num != 0) {
	            int digit = num % 10;
	            reversed = reversed * 10 + digit;
	            num /= 10;
	        }

	        return reversed;
	    }
	}
	
