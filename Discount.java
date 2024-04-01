
//While purchasing certain items, a discount of 10% is offered if the quantity purchased is more than 50. 
//If the quantity purchased is between 25 and 50 (inclusive), a discount of 5% is offered. If the quantity 
//purchased is less than 25, no discount is offered. Write a program to calculate the total expenses given the 
//quantity and price per item entered through the keyboard.

import java.util.Scanner;
public class Discount {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the quantity purchased: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter the price per item: ");
        double pricePerItem = scanner.nextDouble();

        double totalExpenses = quantity * pricePerItem;
        double discount = 0.0;

        if (quantity > 50) {
            discount = 0.10 * totalExpenses;
        } else if (quantity >= 25 && quantity <= 50) {
            discount = 0.05 * totalExpenses;
        }

        double finalExpenses = totalExpenses - discount;

        System.out.println("Total expenses before discount: Rs. " + totalExpenses);
        System.out.println("Discount applied: Rs. " + discount);
        System.out.println("Total expenses after discount: Rs. " + finalExpenses);

        scanner.close();
    }
}
