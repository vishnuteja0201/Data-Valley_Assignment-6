
//Write a Java program to enter numbers until the user wants, and at the end, 
//the program should display the largest and smallest numbers entered.
//Additionally, the program should calculate and display the average of all the numbers entered.

import java.util.Scanner;
public class LargeSmall {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int sum = 0;
        int count = 0;

        char choice;
        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Update smallest and largest
            if (number < smallest) {
                smallest = number;
            }
            if (number > largest) {
                largest = number;
            }

            // Accumulate sum and increment count
            sum += number;
            count++;

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Largest number entered: " + largest);
            System.out.println("Smallest number entered: " + smallest);
            System.out.println("Average of all the numbers entered: " + average);
        } else {
            System.out.println("No numbers entered.");
        }

        scanner.close();
    }
}
