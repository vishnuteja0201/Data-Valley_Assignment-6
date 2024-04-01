//A library charges a fine for every book returned late. 
//For the first 7 days, the fine is 50 paise, for 8-14 days the fine is one rupee, 
//and above 14 days fine is 5 rupees. If you return the book after 21 days, your membership 
//will be canceled. Write a program to accept the number of days the member is late to return 
//the book and display the fine or the appropriate message.

import java.util.Scanner;
public class Library 
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days late: ");
        int daysLate = scanner.nextInt();

        double fine = 0.0;

        if (daysLate <= 7) {
            fine = daysLate * 0.50;
        } else if (daysLate <= 14) {
            fine = 7 * 0.50 + (daysLate - 7) * 1.0;
        } else if (daysLate <= 21) {
            fine = 7 * 0.50 + 7 * 1.0 + (daysLate - 14) * 5.0;
        } else {
            System.out.println("Your membership has been canceled due to returning the book after 21 days.");
            scanner.close();
            return;
        }

        System.out.println("The fine for returning the book " + daysLate + " days late is: Rs. " + fine);

        scanner.close();
    }
}
