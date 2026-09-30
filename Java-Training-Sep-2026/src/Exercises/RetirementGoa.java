package Exercises;

import java.util.Scanner;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 9/30/2026
 **/
public class RetirementGoa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int years;
        double annualSavings;
        double retirementAmount;

        System.out.print("Enter number of years until retirement: ");
        years = sc.nextInt();

        while (years <= 0) {
            System.out.print("Please enter number greater than 0: ");
            years = sc.nextInt();
        }

        System.out.print("Enter the amount you can save annually: ");
        annualSavings = sc.nextDouble();

        while (annualSavings <= 0) {
            System.out.print("Please enter  amount greater than 0: ");
            annualSavings = sc.nextDouble();
        }

        retirementAmount = years * annualSavings;

        System.out.println("The amount you will have in retirement is: R" + retirementAmount + " Enjoy your retirement girl");

    }
}
