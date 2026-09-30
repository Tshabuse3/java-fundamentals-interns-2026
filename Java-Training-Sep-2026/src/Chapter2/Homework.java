package Chapter2;

import java.util.Scanner;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 9/29/2026
 **/
public class Homework {
   public static void main(String[] args) {

               Scanner sc = new Scanner(System.in);

               char bedSize;
               int view;
               double price ;

               System.out.print("Enter room type:  ");
               bedSize = sc.next().charAt(0);

               //room price
               if (bedSize == 'A') {
                   price = 125;
               } else if (bedSize == 'B') {
                   price = 139;
               } else if (bedSize == 'C') {
                   price = 165;
               } else {
                   System.out.println("Invalid room type.");
                   price = 0;
               }

               // The view
               if (price > 0) {
                   System.out.print("Enter view 1 = Lake view, 2 = Park view : ");
                   view = sc.nextInt();

                   if (view == 1) {
                       price = price + 15;
                       System.out.println("Total room price is : $" + price);
                   } else if (view == 2) {
                       System.out.println("Total room price is : $" + price);
                   } else {
                       System.out.println("Invalid view.");
                   }
               }
           }
       }

