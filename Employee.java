//Write a Java program where the current year and the year in which an employee joined the organization 
//are entered through the keyboard. If the number of years for which the employee has served the organization 
//is greater than 5, a bonus of Rs. 5000/- is given to the employee. If the years of service are between 
//3 and 5 (inclusive), a bonus of Rs. 3000/- is given. If the years of service are less than 3, then the program should 
//print a message indicating that no bonus is awarded.

import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();

        System.out.print("Enter the year the employee joined: ");
        int joinedYear = scanner.nextInt();

        int yearsOfService = currentYear - joinedYear;

        if (yearsOfService > 5) {
            System.out.println("Congratulations! You've been awarded a bonus of Rs. 5000/-");
        } else if (yearsOfService >= 3) {
            System.out.println("Congratulations! You've been awarded a bonus of Rs. 3000/-");
        } else {
            System.out.println("Sorry, no bonus is awarded.");
        }

        scanner.close();
    }

}
