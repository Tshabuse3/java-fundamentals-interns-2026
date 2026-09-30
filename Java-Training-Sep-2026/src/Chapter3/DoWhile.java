package Chapter3;

import java.util.Scanner;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 9/30/2026
 * Promt user for any number of integers
 * calculate and display their sum, average
 * Enter zero to stop the program
 **/
public class DoWhile {
   public static void main(String[] args) {

       int count = 0, sum = 0;
       double average = 0;
       int number;
       Scanner sc = new Scanner(System.in);

       do {
           System.out.println("Enter any integer: ");
           number = sc.nextInt();
           sum += number;
           count++;

       } while (number != 0);
       average = sum / count;
       System.out.format("""
               sum:       %d
               average:   %.2f """, sum, average);
   }
        }

