package Chapter4;

import javax.swing.*;
import java.util.Scanner;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 9/30/2026
 **/
public class ParametirizedMethods {
   public static void main(String[] args) {


       int num, yearOfBirth;
       System.out.println("Enter a number to check if it is even: ");
       num = ValueTypeMethods.getScanner().nextInt();// to access the scanner
       System.out.println("IS Even: " + isEven(num));

    yearOfBirth =Integer.parseInt(JOptionPane.showInputDialog("Enter year of birth"));

       System.out.println("Age: " + getAge(yearOfBirth));


   }
    static int getAge(int yearOfBirth){
       final int CURRENT_YEAR = 2026;

               return CURRENT_YEAR - yearOfBirth;
    }
    static boolean isEven(int num){
       return(num %2 == 0);

    }

}
